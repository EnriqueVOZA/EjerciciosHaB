public class Camioneta extends Vehiculo implements Combustion{
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String modelo, int year, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, modelo, year, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String recargarCombustible() {
        return "Recargando combustible";
    }

    @Override
    public int calcularAntigueda() {
        return 2023 - getYear();
    }

    @Override
    public String cargarEnergia() {
        return null;
    }
}
