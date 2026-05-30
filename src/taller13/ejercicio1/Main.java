package taller13.ejercicio1;

public class Main {

    public static void main(String[] args) {
        Figura miRectangulo = new Rectangulo(10.0, 5.0);
        Figura miTriangulo = new Triangulo(8.0, 4.0);

        System.out.println("El area del rectangulo es:");
        System.out.println(miRectangulo.calcularArea());

        System.out.println("El area del triangulo es:");
        System.out.println(miTriangulo.calcularArea());
    }
}
