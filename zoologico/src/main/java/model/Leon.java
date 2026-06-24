package main.java.model;

public class Leon extends Felino {

    public Leon() {
    }

    public Leon(String nombre, int edad) {
        super(nombre, edad);
    }

    public void rugir() {
        System.out.println(nombre + " está rugiendo.");
    }
}
