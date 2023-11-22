package com.ejercicios.logica;

import com.ejercicios.logica.Equipo;
import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2023-11-22T23:32:22")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, LocalDate> fecha;
    public static volatile SingularAttribute<Partido, Integer> resultado1;
    public static volatile SingularAttribute<Partido, Integer> resultado2;
    public static volatile SingularAttribute<Partido, Equipo> equipo2;
    public static volatile SingularAttribute<Partido, Equipo> equipo1;
    public static volatile SingularAttribute<Partido, Long> id;

}