package taller14.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Vehiculo miVehiculo = new Coche();

        System.out.println("--- Punto 1: Intento de invocar metodo inexistente en la base ---");

        miVehiculo.moverse();

        // La siguiente linea daria error de compilacion porque 'encenderRadio' no esta en la clase Vehiculo:
        // miVehiculo.encenderRadio();

        System.out.println("Error observado: El compilador no reconoce 'encenderRadio' porque la referencia es de tipo Vehiculo.");

        System.out.println("\n--- Punto 2: Discusion sobre mala practica ---");
        System.out.println("En la clase Coche, sobrescribimos 'moverse' solo para llamar a 'super.moverse()'.");
        System.out.println("Esto es una mala practica porque no aporta ningun comportamiento nuevo.");
        System.out.println("Aumenta la complejidad del codigo innecesariamente y consume recursos sin beneficio.");
    }
}
