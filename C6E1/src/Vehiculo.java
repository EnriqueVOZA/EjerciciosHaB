public abstract class Vehiculo {
    private int id;
    private String placa;
    private String modelo;
    private int year;
    private double costo;

    public Vehiculo(int id, String placa, String modelo, int year, double costo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.year = year;
        this.costo = costo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public abstract int calcularAntigueda();
    public abstract String cargarEnergia();
    public abstract String recargarCombustible();
}
