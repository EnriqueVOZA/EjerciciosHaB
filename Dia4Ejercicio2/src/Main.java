public class Main {
    public static void main(String[] args) {

        Persona [] personas = new Persona[5];

        personas[0] = new Persona("01AB","Manué",17,"C/Lobo 11 1ºC",847658457);
        personas[1] = new Persona("02AB","Pascu",24,"C/Oso 12 2ºA",843434457);
        personas[2] = new Persona("03AB","Merlu",33,"C/Perro 11 3ºD",845364557);
        personas[3] = new Persona("04AB","Peri",19,"C/Gato 11 5ºC",234678986);
        personas[4] = new Persona("05AB","Franhi",27,"C/Liebre 11 BºC",756958457);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("El nombres es: "+personas[i].getNombre()+" y la edad es: "+personas[i].getEdad());

        }
        personas[1].setNombre("Juanlu");
        personas[4].setNombre("Mario");
        for (int j = 0; j < personas.length; j++) {
            System.out.println("El nombre cambiado es: "+personas[j].getNombre());

        }
        for (int k = 0; k < personas.length; k++) {
            if(personas[k].getEdad()<30){
                System.out.println("Los menores de treinta son: "+personas[k].getNombre());
            }

        }

    }
}