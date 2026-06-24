package main.java.model;

public class Oso extends Animal {

    public Oso() {
    }

    public Oso(String nombre, int edad) {
        super(nombre, edad);
    }

    public void hibernar() {
        System.out.println(nombre + " está hibernando.");
    }
}
