package taller14.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Figura miFigura = new Figura();
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        miFigura.calcularArea();
        miCirculo.calcularArea();
        miRectangulo.calcularArea();
    }
}
