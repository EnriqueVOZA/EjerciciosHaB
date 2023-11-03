public class Zapato extends Vestimenta implements Mostrar{
    private String materia;
    private String tipoDeTejido;

    public Zapato(String codigo, String nombre, double precio, String marca, String talla, String color, String materia, String tipoDeTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.materia = materia;
        this.tipoDeTejido = tipoDeTejido;
    }

    @Override
    public String mostrar() {
        return "Este zapato es de marca: "+getMarca();
    }
}
