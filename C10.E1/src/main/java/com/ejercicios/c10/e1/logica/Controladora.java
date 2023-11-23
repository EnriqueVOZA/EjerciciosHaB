/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.c10.e1.logica;

import com.ejercicios.c10.e1.persistencia.ControladoraPersistencia;

/**
 *
 * @author enriquevoza
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearVoto (Votaciones voto) {
        controlPersis.crearVoto(voto);
    }
    
   
}
