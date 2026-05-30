package taller13.ejercicio2;

public class Pato implements Volador, Nadador {

    @Override
    public void volar() {
        System.out.println("El pato esta volando en el cielo");
    }

    @Override
    public void nadar() {
        System.out.println("El pato esta nadando en el lago");
    }
}
