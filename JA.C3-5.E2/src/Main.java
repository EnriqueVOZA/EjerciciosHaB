import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        // Crear una lista de eventos
        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión", LocalDate.of(2023, 11, 15), "Reunión"),
                new Evento("Conferencia", LocalDate.of(2023, 11, 20), "Conferencia"),
                new Evento("Taller", LocalDate.of(2023, 11, 18), "Taller"),
                new Evento("Reunión", LocalDate.of(2023, 11, 15), "Reunión")
        );

        // Filtrar eventos para una fecha específica
        LocalDate fechaEspecifica = LocalDate.of(2023, 11, 15);
        List<Evento> eventosEnFechaEspecifica = eventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());

        System.out.println("Eventos para la fecha " + fechaEspecifica + ":");
        eventosEnFechaEspecifica.forEach(evento -> System.out.println("- " + evento.getNombre()));

        // Agrupar eventos por categoría y contar cuántos hay en cada categoría
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));

        System.out.println("\nNúmero de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println("- " + categoria + ": " + cantidad + " evento(s)"));

        // Encontrar el evento más próximo en el tiempo
        LocalDate fechaActual = LocalDate.now();
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));

        eventoMasProximo.ifPresentOrElse(
                evento -> System.out.println("\nEl evento más próximo es: " + evento.getNombre()
                        + " el " + evento.getFecha()),
                () -> System.out.println("\nNo hay eventos registrados.")
        );
    }
}





