package org.example;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal(1,"Animal",10,"Plumas","Carnivoro");
        Ave animal2 = new Ave(2,"Ave",3,"Plumas","Herviboro",1.0,"Veloz","Verde","Largo");
        Reptil animal3 = new Reptil(3,"Reptil",3,"Escamas","Omnivoro",0.25,"Duras","Letal","Jungla");

        //d)Si creamos un Objeto de tipo animal y le asignamos un mamifero todo funciona correctamente.
        Animal animal4 = new Mamifero(4,"Mamifero",4,"Pelo","Herviboro",4,"Asistida","Verde","Campo");
        //e)Si se cambian a private los metodos dejan de poder ser llamados.

        System.out.println(" "+animal.saludar());
        System.out.println(" "+animal4.saludar());
        System.out.println(" "+animal2.saludar());
        System.out.println(" "+animal3.saludar());

        //
    }

}