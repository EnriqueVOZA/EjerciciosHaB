import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double[] temps = new double[7];
        double total = 0;

        //Solicitar que ingrese la temperaturas maximas de los 7 últimos días.
        for (int i = 0; i < temps.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la temperatura" + (i +1)+": ");
            temps[i] = scanner.nextDouble();
            total += temps[i];



        }
        //Calcular el promedio
        double media = (double) total / 7;
        System.out.println("La temperatura promedio es: "+media);

    }

}


















/*public static void main(String[] args) {
        int counter = 0;

        do {
        Scanner scanner = new Scanner(System.in);
        double temp;
        System.out.println("Ingrese la temperatura máxima del día");
        temp = scanner.nextDouble();
        counter++;

        }while(counter < 7);

        System.out.println("");*/