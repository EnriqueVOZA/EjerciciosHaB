public class Persona {

    private String id;
    private String nombre;
    private int edad;
    private String direccion;
    private int nroTlf;

    public Persona(String id, String nombre, int edad, String direccion, int nroTlf) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.nroTlf = nroTlf;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", nroTlf=" + nroTlf +
                '}';
    }

    public Persona() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNroTlf() {
        return nroTlf;
    }

    public void setNroTlf(int nroTlf) {
        this.nroTlf = nroTlf;
    }
}
