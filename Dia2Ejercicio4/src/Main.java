import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2, suma, resta, multiplicacion, division;
        System.out.println("Ingrese el primer numero");
        num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número");
        num2 = scanner.nextDouble();
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion = num1*num2;
        division = num1/num2;
        if (num1 == 0 && num2 == 0){
            division = 0;
        }

        System.out.println("La suma es: "+suma+", la resta es: "+resta+", la multiplicación es: "+multiplicacion+" y la división es: "+division);
    }
}