public class Main {
    public static void main(String[] args) {


        Electrodomestico [] electrodomesticos = new Electrodomestico[4];
        electrodomesticos[0] = new Electrodomestico(24,"FAGOR","BMW320",24.34,"Negro");
        electrodomesticos[1] = new Electrodomestico(346,"BOSCH","NP210",34.44,"Blanco");
        electrodomesticos[2] = new Electrodomestico(4567, "ROCA","RC11",24.35,"Violeta");
        electrodomesticos[3] = new Electrodomestico();

        for (int i = 0; i < electrodomesticos.length; i++) {
            System.out.println("La marca es: "+electrodomesticos[i].getMarca()+", el modelo es: "+electrodomesticos[i].getModelo()+" y el consumo es: "+electrodomesticos[i].getConsumo());

        }

    }
}