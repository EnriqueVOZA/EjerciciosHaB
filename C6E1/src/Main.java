import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //f)

        List<Vehiculo> listaVehiculos = new ArrayList<>();

        Vehiculo vehiculo1 = new Auto(1,"AB00","Cupe",1999,1000.0,0.0,400.00);
        Vehiculo vehiculo2 = new Camioneta(2,"AB01","Berlina",2001,1500.00,150,1);
        Vehiculo vehiculo3 = new Moto(3,"AB02","Enduro",2005,1200.0,150,"Caballo");

        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);
        listaVehiculos.add(vehiculo3);


        //g) Calculo antigüedad y mostrar si carga o no
        for (Vehiculo vehiculo :listaVehiculos) {
            System.out.println("La placa es: "+ vehiculo.getPlaca()+" "+vehiculo.calcularAntigueda()+" "+vehiculo.recargarCombustible()+" "+vehiculo.cargarEnergia());

        }

        //
    }
}