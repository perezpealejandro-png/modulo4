package main.java.model;

public class Felino extends Animal {

    public Felino() {
    }

    public Felino(String nombre, int edad) {
        super(nombre, edad);
    }

    public void acechar() {
        System.out.println(nombre + " está acechando.");
    }
}
