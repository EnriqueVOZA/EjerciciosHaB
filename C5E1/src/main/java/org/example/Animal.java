package org.example;

public class Animal {
    private int id;
    private String nombre;
    private int edad;
    private String tipoDePiel;
    private String tipoDeAlimentacion;

    public Animal() {
    }

    public Animal(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoDePiel = tipoDePiel;
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoDePiel() {
        return tipoDePiel;
    }

    public void setTipoDePiel(String tipoDePiel) {
        this.tipoDePiel = tipoDePiel;
    }

    public String getTipoDeAlimentacion() {
        return tipoDeAlimentacion;
    }

    public void setTipoDeAlimentacion(String tipoDeAlimentacion) {
        this.tipoDeAlimentacion = tipoDeAlimentacion;
    }

    public String saludar(){
        return "Soy un animal";
    }
}
