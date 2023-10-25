import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precio = 0.00;
        double total = 0.00;

        System.out.println("Ingrese el precio del producto o 0 para finalizar.");
        precio = scanner.nextDouble();
        total += precio;
        while (precio > 0) {
            System.out.println("Ingrese el siguiente precio o pulse 0 para finalizar.");
            precio = scanner.nextDouble();
            total+=precio;
        }
        System.out.println("Hemos finalizado, el total es: "+total);




    }
}