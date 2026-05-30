package taller14.ejercicio4;

public class Main {

    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miBicicleta = new Bicicleta();
        Vehiculo vehiculoGenerico = new Vehiculo();

        miCoche.mover();
        miBicicleta.mover();
        vehiculoGenerico.mover();
    }
}
