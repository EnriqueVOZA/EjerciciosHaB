import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List <Empleado> empleados = List.of(
                new Empleado("Juan", 100000, "Admin"),
                new Empleado("Pedro", 200000, "Gerente"),
                new Empleado("Jose", 50000, "Desarrollador"),
                new Empleado("Luis", 120000, "Gerente"),
                new Empleado("Memo", 80000, "Desarrollador")
        );

        List <Empleado> empleadosFiltrados = empleados.stream()
                .filter(e -> e.getSalario() > 100000)
                .toList();
        System.out.println(empleadosFiltrados);


        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        Map<String, Double> categoriaSalario = empleados.stream()
              .collect(Collectors.groupingBy(Empleado::getCategoria, Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println(categoriaSalario);


        //Encuentra al empleado con el salario más alto utilizando Optionals.
        Optional<Empleado> empleadoMayorSalario = empleados.stream()
              .max(Comparator.comparing(Empleado::getSalario));
        System.out.println(empleadoMayorSalario);



    }







}