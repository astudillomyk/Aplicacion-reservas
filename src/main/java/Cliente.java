import java.util.Scanner;

public class Cliente extends Persona { 
    private int nroAcompañantes;
    private int numeroReserva;
    private String horaReserva;
    private String telefono;

    public Cliente(String nombre, int edad, String rut, int nroAcompañantes, int numeroReserva, String horaReserva, String telefono) {
        super(nombre, edad, rut);
        this.nroAcompañantes = nroAcompañantes;
        this.numeroReserva = numeroReserva;
        this.horaReserva = horaReserva;
        this.telefono = telefono;
    }

    public Cliente() {
        super();
        this.nroAcompañantes = ingresarNroAcompañantes();
        this.numeroReserva = crearNumeroReserva();
        this.horaReserva = mostrarHoraReserva();
        this.telefono = ingresarTelefono();

    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public int ingresarNroAcompañantes(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número de acompañantes: ");
        int nroAcompañantes = teclado.nextInt();
        return nroAcompañantes;
    }

    public int crearNumeroReserva() {
        numeroReserva = (int) (Math.random() * 999999);
        System.out.println("Su número de reserva es: "+numeroReserva);
        return numeroReserva;
    }

    public String mostrarHoraReserva() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la hora que desea reservar: ");
        String horaReserva = teclado.next();
        return horaReserva;
    }

    public String ingresarTelefono() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese telefono: ");
        String telefono = teclado.next();
        return telefono;
    }

    @Override
    public String toString() {
        return super.toString() + "Número Reserva: " + numeroReserva + "| " + "Hora Reserva: " + horaReserva + " | " + "Telefono:" + telefono + " | ";
    }

}
