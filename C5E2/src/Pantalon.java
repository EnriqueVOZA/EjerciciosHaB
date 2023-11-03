public class Pantalon extends Vestimenta implements Mostrar{
    private String estilo;
    private String tipoDeTejido;

    public Pantalon() {
    }

    public Pantalon(String codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoDeTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoDeTejido = tipoDeTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    @Override
    public String mostrar() {
        return "Este pantalón es de marca: "+getEstilo();
    }
}
