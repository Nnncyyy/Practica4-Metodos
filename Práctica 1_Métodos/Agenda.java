import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

// Clase que representa un contacto
class Contacto {
    String nombre;
    String telefono;
    String email;

    // Constructor
    public Contacto(String nombre, String telefono, String email) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
}

// Clase que maneja la agenda
class Agenda {
    static Contacto[] contactos = new Contacto[100]; // Máximo 100 contactos
    static int numContactos = 0;
    static Scanner scanner = new Scanner(System.in);

    // Agregar un contacto
    static void agregarContacto() {
        if (numContactos < 100) {
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Teléfono: ");
            String telefono = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();

            contactos[numContactos] = new Contacto(nombre, telefono, email);
            numContactos++;
            System.out.println("¡¡¡Contacto agregado con éxito!!!");
        } else {
            System.out.println("La agenda está llena.");
        }
    }

    // Buscar un contacto
    static void buscarContacto() {
        System.out.print("Ingrese el nombre del contacto: ");
        String nombreBuscado = scanner.nextLine();
        System.out.println();

        int id = buscarID(nombreBuscado);
        if (id != -1) {
            System.out.println("Informacion del contacto:");
            mostrarInformacionContacto(id);
        } else {
            System.out.println("Contacto NO encontrado.");
        }
    }

    // Obtener el índice de un contacto
    private static int buscarID(String nombreBuscado) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].nombre.equals(nombreBuscado)) {
                return i;
            }
        }
        return -1;
    }
    
    // Mostrar lista de contactos
    static void mostrarContactos() {
        if (numContactos == 0) {
            System.out.println("No hay contactos guardados.");
            return;
        }
    
        System.out.println("------------- Lista de Contactos ------------- \n");
        for (int i = 0; i < numContactos; i++) {
            System.out.println("--------------- Contacto No. " + (i+1) + " ---------------");
            mostrarInformacionContacto(i);
            System.out.println();
        }
    }
    
    // Mostrar un contacto
    private static void mostrarInformacionContacto(int id) {
        System.out.println("Nombre: " + contactos[id].nombre);
        System.out.println("Teléfono: " + contactos[id].telefono);
        System.out.println("Email: " + contactos[id].email);
    }

    // Eliminar un contacto
    static void eliminarContacto() {
        System.out.print("Ingrese el nombre del contacto a eliminar: ");
        String nombreBuscado = scanner.nextLine();

        int id = buscarID(nombreBuscado);
        if (id != -1) {
            for (int i = id; i < numContactos - 1; i++) {
                contactos[i] = contactos[i + 1];
            }
            contactos[numContactos - 1] = null;
            numContactos--;
            System.out.println("¡¡¡Contacto eliminado con éxito!!!");
        } else {
            System.out.println("Contacto NO encontrado.");
        }
    }

    // Guardar contactos en archivo
    static void guardarContactos() {
        try {
            PrintWriter archivo = new PrintWriter("contactos.txt");
            archivo.println("---------------------------------- CONTACTOS ----------------------------------");
            archivo.println();

            for (int i = 0; i < numContactos; i++) {
                archivo.println("------------------------ Contacto No. " + (i+1) + " ------------------------");
                archivo.println("Nombre: " + contactos[i].nombre + "\n" +
                                "Telefono:" + contactos[i].telefono + "\n" + 
                                "Email: " + contactos[i].email  + "\n");
            }
            archivo.close();
            System.out.println("¡¡¡Contactos guardados con éxito!!!");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo.");
        }
    }

    // Cargar contactos desde un archivo
    static void cargarContactos() {
        try {
            System.out.print("Ingrese el nombre del archivo: ");
            String nombreArchivo = scanner.nextLine();

            File archivo = new File(nombreArchivo);
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine() && numContactos < 100) {
                String linea = lector.nextLine();
                String[] datos = linea.split(",");

                if (datos.length == 3) {
                    contactos[numContactos] = new Contacto(datos[0], datos[1], datos[2]);
                    numContactos++;
                }
            }
            lector.close();
            System.out.println("¡¡¡Contactos cargados con éxito!!!");
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo.");
        }
    }

    // Menú principal
    static void menu() {
        int opcion;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Guardar contactos en un archivo");
            System.out.println("6. Cargar contactos desde un archivo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            System.out.println();
            
            switch (opcion) {
                case 1:
                    System.out.println("--------------- Agregar contacto ---------------");
                    agregarContacto();
                    break;
                case 2:
                    mostrarContactos();
                    break;
                case 3:
                    System.out.println("-------------------- Buscar contacto --------------------");
                    buscarContacto();
                    break;
                case 4:
                    System.out.println("-------------------- Eliminar contacto --------------------");
                    eliminarContacto();
                    break;
                case 5:
                    guardarContactos();
                    break;
                case 6:
                    System.out.println("--------------- Cargar contactos desde un archivo ---------------");
                    cargarContactos();

                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}