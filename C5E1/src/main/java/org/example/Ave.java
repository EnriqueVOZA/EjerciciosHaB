package org.example;

public class Ave extends Animal{
    private double envergaduraDeAlas;
    private String tipoDeVuelo;
    private String colorDelPlumaje;
    private String tipoDePico;

    public Ave(int id, String nombre, int edad, String tipoDePiel, String tipoDeAlimentacion, double envergaduraDeAlas, String tipoDeVuelo, String colorDelPlumaje, String tipoDePico) {
        super(id, nombre, edad, tipoDePiel, tipoDeAlimentacion);
        this.envergaduraDeAlas = envergaduraDeAlas;
        this.tipoDeVuelo = tipoDeVuelo;
        this.colorDelPlumaje = colorDelPlumaje;
        this.tipoDePico = tipoDePico;
    }

    public double getEnvergaduraDeAlas() {
        return envergaduraDeAlas;
    }

    public void setEnvergaduraDeAlas(double envergaduraDeAlas) {
        this.envergaduraDeAlas = envergaduraDeAlas;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getColorDelPlumaje() {
        return colorDelPlumaje;
    }

    public void setColorDelPlumaje(String colorDelPlumaje) {
        this.colorDelPlumaje = colorDelPlumaje;
    }

    public String getTipoDePico() {
        return tipoDePico;
    }

    public void setTipoDePico(String tipoDePico) {
        this.tipoDePico = tipoDePico;
    }

    @Override
    public String saludar(){
        return "Soy un ave";
    }
}
