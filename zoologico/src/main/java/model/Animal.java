package main.java.model;

public class Animal {
    /*Esta es una clase que representa un animal
    con sus atributos básicos como nombre, edad, especie, color y habitat.
     */
    public String nombre; //Nombre del animal
    public int edad; //Edad del animal
    public String especie; //Especie del animal
    public String color; //Color del animal
    public String habitat; //Habitat del animal

    public Animal() {
        //Constructor vacío
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal(String nombre, int edad, String especie, String color, String habitat) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.color = color;
        this.especie = especie;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
