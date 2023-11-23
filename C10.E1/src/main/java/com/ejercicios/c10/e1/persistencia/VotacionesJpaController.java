/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.c10.e1.persistencia;

import com.ejercicios.c10.e1.logica.Votaciones;
import com.ejercicios.c10.e1.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author enriquevoza
 */
public class VotacionesJpaController implements Serializable {

    public VotacionesJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;
    
    public VotacionesJpaController( ) {
       emf = Persistence.createEntityManagerFactory("votacionesPU");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Votaciones votaciones) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(votaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Votaciones votaciones) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            votaciones = em.merge(votaciones);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = votaciones.getId();
                if (findVotaciones(id) == null) {
                    throw new NonexistentEntityException("The votaciones with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Votaciones votaciones;
            try {
                votaciones = em.getReference(Votaciones.class, id);
                votaciones.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The votaciones with id " + id + " no longer exists.", enfe);
            }
            em.remove(votaciones);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Votaciones> findVotacionesEntities() {
        return findVotacionesEntities(true, -1, -1);
    }

    public List<Votaciones> findVotacionesEntities(int maxResults, int firstResult) {
        return findVotacionesEntities(false, maxResults, firstResult);
    }

    private List<Votaciones> findVotacionesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Votaciones.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Votaciones findVotaciones(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Votaciones.class, id);
        } finally {
            em.close();
        }
    }

    public int getVotacionesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Votaciones> rt = cq.from(Votaciones.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
