import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascotas<T> {
    private List<Mascota<T>> registro;

    public RegistroMascotas() {
        this.registro = new ArrayList<>();
    }

    // Método genérico para agregar mascotas al registro
    public void agregarMascota(Mascota<T> mascota) {
        registro.add(mascota);
    }

    // Método genérico para buscar mascotas por nombre
    public List<Mascota<T>> buscarNombre(String nombre) {
        List<Mascota<T>> resultados = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                resultados.add(mascota);
            }
        }
        return resultados;
    }

    // Método genérico para buscar mascotas por especie
    public List<Mascota<T>> buscarEspecie(T especie) {
        List<Mascota<T>> resultados = new ArrayList<>();
        for (Mascota<T> mascota : registro) {
            if (mascota.getEspecie().equals(especie)) {
                resultados.add(mascota);
            }
        }
        return resultados;
    }

    // Método para contar la cantidad total de mascotas registradas
    public int contarMascotasRegistradas() {
        return registro.size();
    }

    // Método genérico para generar datos aleatorios para mascotas
    public void generarDatosAleatorios(int cantidad) {
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int id = i + 1;
            String nombre = generarNombreAleatorio();
            int edad = random.nextInt(10) + 1;

            String[] especies = {"Perro", "Gato", "Reptil", "Ave"};
            String especieAleatoria = especies[random.nextInt(especies.length)];

            Mascota<T> mascota = new Mascota<>(id, nombre, edad, (T) especieAleatoria);
            agregarMascota(mascota);
        }
    }

    // Método para generar un nombre aleatorio
    private String generarNombreAleatorio() {
        String[] nombres = {"Buddy", "Luna", "Max", "Coco", "Mia", "Rocky", "Daisy", "Charlie"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }
}
