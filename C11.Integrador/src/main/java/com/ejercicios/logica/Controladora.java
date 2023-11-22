/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.logica;

import com.ejercicios.persistencia.ControladoraPersistencia;
import java.util.List;

/**
 *
 * @author enriquevoza
 */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    
    public void crearEquipo (Equipo equi){
        controlPersis.crearEquipo(equi);
    }
    
    
    public List<Equipo> obtenerEquipos(){
        return controlPersis.mostrarEquipos();
    }
    
    public void añadirPartido(Partido partido, Long puntos1, Long puntos2) {
        controlPersis.añadirPartido(partido, puntos1, puntos2);
    }
    
    public List<Partido> mostrarPartidos() {

        return controlPersis.mostrarPartidos();

    }
}

