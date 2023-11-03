public class Moto extends Vehiculo implements Combustion{
    private int cilindrada;
    private String tipoDeMotor;

    public Moto(int id, String placa, String modelo, int year, double costo, int cilindrada, String tipoDeMotor) {
        super(id, placa, modelo, year, costo);
        this.cilindrada = cilindrada;
        this.tipoDeMotor = tipoDeMotor;
    }

    @Override
    public String recargarCombustible() {
        return "Recargando combustible";
    }

    @Override
    public int calcularAntigueda() {
        return 0;
    }

    @Override
    public String cargarEnergia() {
        return null;
    }
}
