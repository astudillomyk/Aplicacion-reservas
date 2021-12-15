import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String rut;

    public Persona(String nombre, int edad, String rut) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
    }

    public Persona() {
        this.nombre = ingresarNombre();
        this.edad = ingresarEdad();
        this.rut = ingresarRut();
    }


    public String getRut() {
        return rut;
    }
    
    

    public String ingresarNombre() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombre = teclado.next();
        return nombre;
    }

    public int ingresarEdad() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese edad: ");
        int edad = teclado.nextInt();
        return edad;
    }

    public String ingresarRut() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese rut: ");
        String rut = teclado.next();
        return rut;
    }

    @Override
    public String toString() {
        return " | " + "Nombre: " + nombre + " | " + "edad: " + edad + " | " + "rut: " + rut + " | ";
    }
    
    

}
