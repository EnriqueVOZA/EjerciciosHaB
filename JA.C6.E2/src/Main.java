import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistroMascotas<String> registroMascotas = new RegistroMascotas<>();

        registroMascotas.agregarMascota(new Mascota<>(1, "Fido", 3, "Perro"));
        registroMascotas.agregarMascota(new Mascota<>(2, "Whiskers", 2, "Gato"));
        registroMascotas.agregarMascota(new Mascota<>(3, "Spike", 5, "Reptil"));

        List<Mascota<String>> mascotasNombre = registroMascotas.buscarNombre("Fido");
        System.out.println("Mascotas por nombre: " + mascotasNombre);

        List<Mascota<String>> mascotasEspecie = registroMascotas.buscarEspecie("Gato");
        System.out.println("Mascotas por especie: " + mascotasEspecie);

        int totalMascotas = registroMascotas.contarMascotasRegistradas();
        System.out.println("Total de mascotas registradas: " + totalMascotas);

        registroMascotas.generarDatosAleatorios(5);
        System.out.println("Mascotas después de generar datos aleatorios: " + registroMascotas);
    }

}