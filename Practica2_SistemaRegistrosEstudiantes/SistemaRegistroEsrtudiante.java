import java.util.Scanner;
import clases.Estudiantes;

/*class Estudiante{
    String nombre;
    int edad;
    String matricula;
    String carrera;
}*/

public class SistemaRegistroEsrtudiante{

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Estudiantes[] estudiantes = new Estudiantes [100];

    int numEstudiantes = 0;
    int opcion;

    do {

        System.out.println("\n--- Sistema de Registro de Estudiantes ---");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Mostrar estudiantes");
        System.out.println("3. Buscar estudiante por matrícula");
        System.out.println("4. Eliminar estudiante");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");

        opcion = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer

    switch (opcion) {

    case 1:

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt(); 
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Matricula: ");
        String  matricula = scanner.nextLine();
        System.out.print("Carrera: ");
        String carrera = scanner.nextLine();

        Estudiantes nuevoEstudiante = new Estudiantes();
        nuevoEstudiante.nombre = nombre;
        nuevoEstudiante.edad = edad;
        nuevoEstudiante.matricula = matricula;
        nuevoEstudiante.carrera = carrera;

        estudiantes[numEstudiantes] = nuevoEstudiante;
        numEstudiantes++; 
        System.out.println("Estudiante registrado con éxito."); 
        break;

    case 2:

        if (numEstudiantes == 0) {

            System.out.println("No hay estudiantes registrados.");

        } else {

            System.out.println("\n Lista de Estudiantes --");

            for (int i=0; i < numEstudiantes; i++) {

                System.out.println("Nombre: " + estudiantes[i].nombre);
                System.out.println("Edad: " + estudiantes[i].edad);
                System.out.println("Matrícula:" + estudiantes[i].matricula);
                System.out.println("Carrera:" + estudiantes[i].carrera);
                System.out.println("---");

            }
        }

        break;

    case 3:

        System.out.print("Ingrese la matrícula a buscar: ");
        String matriculaBuscar = scanner.nextLine();
        boolean encontrado = false;

        for (int i=0; 1 < numEstudiantes; i++) {

            if (estudiantes[i].matricula.equals(matriculaBuscar)) { 
                System.out.println("Nombre:" + estudiantes[i].nombre); 
                System.out.println("Edad:" + estudiantes[i].edad);
                System.out.println("Matrícula:" + estudiantes[i].matricula);
                System.out.println("Carrera: " + estudiantes[i].carrera);

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {

            System.out.println("Estudiante no encontrado.");

        }

        break;

    case 4:

        System.out.print("Ingrese la matrícula del estudiante a eliminar:");
        String matriculaEliminar = scanner.nextLine();
        boolean eliminado = false;

        for (int i=0; i < numEstudiantes; i++) {

            if (estudiantes[i].matricula.equals(matriculaEliminar)) {

                for (int j=i; j < numEstudiantes - 1; j++) { 

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

        break;

    case 0:

        System.out.println("Saliendo del sistema...");

        break;

    default:

        System.out.println("Opción no válida.");
    } 
        
    } while (opcion != 0);

        scanner.close();
    }
}

