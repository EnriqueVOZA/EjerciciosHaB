import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola "+nombre+", bienvenido al sistema.");
    }
}