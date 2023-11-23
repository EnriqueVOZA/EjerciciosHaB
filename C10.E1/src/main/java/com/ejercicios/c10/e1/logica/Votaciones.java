/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.c10.e1.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author enriquevoza
 */

@Entity
public class Votaciones implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partido;
    private int voto;

    public Votaciones(Long id, String partido, int voto) {
        this.id = id;
        this.partido = partido;
        this.voto = voto;
    }

    public Votaciones() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public void incrementarVoto(){
        this.voto++;
    }
    
    
}
