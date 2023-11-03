public class Camiseta extends Vestimenta implements Mostrar{

    private String manga;
    private String cuello;

    public Camiseta(String codigo, String nombre, double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    @Override
    public String mostrar() {
        return "Esta camiseta es de marca: "+getManga();
    }
}
