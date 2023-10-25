import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad.");
        edad = scanner.nextInt();

        if (edad < 18){
            System.out.println("Los menores de edad no pueden acceder al recital.");

        }else System.out.println("Adelante, es mayor de edad.");



    }
}