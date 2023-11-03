import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vestimenta> listaVestimenta = new ArrayList<>();



        Vestimenta vestimenta1 = new Zapato("0A","Naútico",69.99,"Pimberland","S","Marron","Duro","Cuero");
        Vestimenta vestimenta2 = new Zapato("0B","Sandalias",29.99,"Sike","39","Azul","Duro","Sintético");
        Vestimenta vestimenta3 = new Zapato("0C","Sneaker",250.50,"Meow Unbalance","Blanco","Blanco","Blando","Sintético");
        Vestimenta vestimenta4 = new Pantalon("0D","Vaquero",80.00,"Lewis","L","Azul","Tejano","Vaquero");
        Vestimenta vestimenta5 = new Pantalon("0E","Bañador",20.00,"Beebok","M","Negro","Veraniego","Sintético");
        Vestimenta vestimenta6 = new Pantalon("0F","Chino",90.00,"Rockers","M","Caqui","Serio","Algondon");
        Vestimenta vestimenta7 = new Camiseta("0G","Interior",10.00,"Sara","S","Blanco","Corta","Sin");
        Vestimenta vestimenta8 = new Camiseta("0H","Vaquera",30.00,"Legüis","L","Gris","Larga","Camisa");
        Vestimenta vestimenta9 = new Sombrero("0I","Pimpom",1000.00,"Dior","XL","Negro","Bombin","Enorme");


        listaVestimenta.add(vestimenta1);
        listaVestimenta.add(vestimenta2);
        listaVestimenta.add(vestimenta3);
        listaVestimenta.add(vestimenta4);
        listaVestimenta.add(vestimenta5);
        listaVestimenta.add(vestimenta6);
        listaVestimenta.add(vestimenta7);
        listaVestimenta.add(vestimenta8);
        listaVestimenta.add(vestimenta9);

        for (Vestimenta vestimenta : listaVestimenta) {
            System.out.println(""+vestimenta.mostrar());
        }



    }
}