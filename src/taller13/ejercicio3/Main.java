package taller13.ejercicio3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Analisis del Ejercicio 3:");

        System.out.println("1. Error al no implementar metodos de una interfaz:");
        System.out.println("Si una clase concreta implementa una interfaz pero no define sus metodos, Java arroja un error de compilacion.");
        System.out.println("La unica solucion es que la clase se declare como abstracta o que implemente obligatoriamente todos los metodos.");

        System.out.println("2. Uso de metodos predeterminados en clases abstractas:");
        System.out.println("La palabra reservada 'default' es exclusiva de las interfaces desde Java 8.");
        System.out.println("No es posible usarla en clases abstractas porque en ellas los metodos con cuerpo se definen de forma normal, sin usar 'default'.");
    }
}