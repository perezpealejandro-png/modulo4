package main.java.model;

public class Vaca extends Animal {

    public Vaca() {
    }

    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    public void mugir() {
        System.out.println(nombre + " dice Muuuuu.");
    }
}
