package taller14.ejercicio2;

public class Main {

    public static void main(String[] args) {
        Persona miPersona = new Persona();
        Persona miEstudiante = new Estudiante();
        Persona miProfesor = new Profesor();

        miPersona.presentarse();
        miEstudiante.presentarse();
        miProfesor.presentarse();
    }
}
