package main.java.model;

public class Tigre extends Felino {

    public Tigre() {
    }

    public Tigre(String nombre, int edad) {
        super(nombre, edad);
    }

    public void cazar() {
        System.out.println(nombre + " está cazando.");
    }
}
