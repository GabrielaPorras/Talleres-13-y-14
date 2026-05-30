package taller14.ejercicio1;

public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = 3.14159 * radio * radio;
        System.out.println("El area del circulo es: " + area);
    }
}
