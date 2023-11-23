/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.c10.e1.persistencia;

import com.ejercicios.c10.e1.logica.Votaciones;

/**
 *
 * @author enriquevoza
 */
public class ControladoraPersistencia {
    
    VotacionesJpaController votacionesJPA = new VotacionesJpaController();
     public void crearVoto(Votaciones voto) {
        
        votacionesJPA.create(voto);
    }
     public Votaciones buscarVotaciones (Long id){
         return votacionesJPA.findVotaciones(id);
     }
     
     
}
