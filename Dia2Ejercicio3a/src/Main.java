public class Main {
    public static void main(String[] args) {

        double base = 12.5;
        double altura = 20.3;
        double area = base * (altura/2);
        double areaFormat = Math.round(area*100.0)/100.0;
        System.out.println("El área es: "+areaFormat);
    }
}