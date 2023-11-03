public class Auto extends Vehiculo implements Electrico{
    private double capacidadBateria;

    private double autonomia;

    public Auto(int id, String placa, String modelo, int year, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, modelo, year, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    @Override
    public String cargarEnergia() {
        return "Cargando energía";
    }

    @Override
    public String recargarCombustible() {
        return null;
    }

    @Override
    public int calcularAntigueda() {
        return 2023 - getYear();
    }
}
