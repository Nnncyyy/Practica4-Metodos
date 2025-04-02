package clases;
public class Estudiantes {
    public String nombre;
    public int edad;
    public String matricula;
    public String carrera;

    public Estudiantes ( ) {
     
        nombre = "nombre";
        edad = 0;
        matricula = "nombre";
        carrera = "carrera";
    }
    public Estudiantes (String nombre, int edad, String matricula, String carrera ) {
     
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = nombre;
        this.carrera = carrera;
    }
}
