/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ejercicios.persistencia;

import com.ejercicios.logica.Equipo;
import com.ejercicios.logica.Partido;
import java.util.List;

/**
 *
 * @author enriquevoza
 */
public class ControladoraPersistencia {
    
    EquipoJpaController equipoJPA = new EquipoJpaController();
    PartidoJpaController partidoJPA = new PartidoJpaController();
    
    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }
    
    public void crearPartido(Partido partido) {
        partidoJPA.create(partido);
    }
    
    public List<Equipo> mostrarEquipos() {
        List<Equipo> equipos = equipoJPA.findEquipoEntities();

        return equipos;
    }
    
    
    public List<Partido> mostrarPartidos() {
        List<Partido> partidos = partidoJPA.findPartidoEntities();

        return partidos;
    }
    
    public void añadirPartido(Partido partido, Long idEquipo1, Long idEquipo2) {

        Equipo equipo1 = equipoJPA.findEquipo(idEquipo1);
        Equipo equipo2 = equipoJPA.findEquipo(idEquipo2);

        partido.setEquipo1(equipo1);
        partido.setEquipo2(equipo2);
        partidoJPA.create(partido);

    }
}
