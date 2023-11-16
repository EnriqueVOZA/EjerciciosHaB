import java.util.List;

public class Main {
    public static void main(String[] args) {

        InventarioAutos inventarioAutos = new InventarioAutos();

        Auto auto1 = new Auto("Ford", "Fiesta", 2002, 2500.0);
        Auto auto2 = new Auto("Seat", "Ibiza", 2001, 1500.0);
        Auto auto3 = new Auto("Peugeot", "206", 1999, 5000.0);

        inventarioAutos.agregarAuto(auto1);
        inventarioAutos.agregarAuto(auto2);
        inventarioAutos.agregarAuto(auto3);

        // Buscar autos por marca
        List<Auto> autosFord = inventarioAutos.buscarMarca("Ford");
        System.out.println("Autos de Ford: " + autosFord);

        // Buscar autos por año
        List<Auto> autos1999 = inventarioAutos.buscarPorAnio(1999);
        System.out.println("Autos del año 1999: " + autos1999);

        // Calcular el valor total del inventario
        double valorTotal = inventarioAutos.calcularValorTotal();
        System.out.println("Valor total del inventario: $" + valorTotal);
    }
}