package org.example;

public class Mamifero extends Animal{
    private int numeroDePatas;
    private String tipoDeReproduccion;
    private String colorDelPelaje;
    private String habitat;


    public Mamifero(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, int numeroDePatas, String tipoDeReproduccion, String colorDelPelaje, String habitat) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.numeroDePatas = numeroDePatas;
        this.tipoDeReproduccion = tipoDeReproduccion;
        this.colorDelPelaje = colorDelPelaje;
        this.habitat = habitat;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public String getTipoDeReproduccion() {
        return tipoDeReproduccion;
    }

    public void setTipoDeReproduccion(String tipoDeReproduccion) {
        this.tipoDeReproduccion = tipoDeReproduccion;
    }

    public String getColorDelPelaje() {
        return colorDelPelaje;
    }

    public void setColorDelPelaje(String colorDelPelaje) {
        this.colorDelPelaje = colorDelPelaje;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String saludar(){
        return "Soy un mamífero";
    }
}
