package clases;

public class Estudiantes {
    public String nombre;
    public int edad;
    public String matricula;
    public String carrera;

    public Estudiantes() {
        this.nombre = "nombre";
        this.edad = 0;
        this.matricula = "matricula";
        this.carrera = "carrera";
    }

    public Estudiantes(String nombre, int edad, String matricula, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.carrera = carrera;
    }
}

import java.util.Scanner;
import clases.Estudiantes;

public class SistemaRegistroEstudiante {
    private static Scanner scanner = new Scanner(System.in);
    private static Estudiantes[] estudiantes = new Estudiantes[100];
    private static int numEstudiantes = 0;

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            procesarOpcion(opcion);
        } while (opcion != 0);
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n--- Sistema de Registro de Estudiantes ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Buscar estudiante por matrícula");
        System.out.println("4. Eliminar estudiante");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarEstudiante();
                break;
            case 2:
                mostrarEstudiantes();
                break;
            case 3:
                buscarEstudiante();
                break;
            case 4:
                eliminarEstudiante();
                break;
            case 0:
                System.out.println("Saliendo del sistema...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void registrarEstudiante() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Matricula: ");
        String matricula = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        estudiantes[numEstudiantes] = new Estudiantes(nombre, edad, matricula, carrera);
        numEstudiantes++;
        System.out.println("Estudiante registrado con éxito.");
    }

    private static void mostrarEstudiantes() {
        if (numEstudiantes == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de Estudiantes:");
            for (int i = 0; i < numEstudiantes; i++) {
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Edad: " + estudiantes[i].edad);
                System.out.println("Matrícula: " + estudiantes[i].matricula);
                System.out.println("Carrera: " + estudiantes[i].carrera);
                System.out.println("---");
            }
        }
    }

    private static void buscarEstudiante() {
        System.out.print("Ingrese la matrícula a buscar: ");
        String matriculaBuscar = scanner.nextLine();
        boolean encontrado = false;

        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].matricula.equals(matriculaBuscar)) {
                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Edad: " + estudiantes[i].edad);
                System.out.println("Matrícula: " + estudiantes[i].matricula);
                System.out.println("Carrera: " + estudiantes[i].carrera);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }

    private static void eliminarEstudiante() {
        System.out.print("Ingrese la matrícula del estudiante a eliminar: ");
        String matriculaEliminar = scanner.nextLine();
        boolean eliminado = false;

        for (int i = 0; i < numEstudiantes; i++) {
            if (estudiantes[i].matricula.equals(matriculaEliminar)) {
                for (int j = i; j < numEstudiantes - 1; j++) {
                    estudiantes[j] = estudiantes[j + 1];
                }
                numEstudiantes--;
                eliminado = true;
                System.out.println("Estudiante eliminado con éxito.");
                break;
            }
        }
        if (!eliminado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
