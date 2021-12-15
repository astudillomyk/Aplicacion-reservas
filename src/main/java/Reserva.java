import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reserva {

    static List<Cliente> clientes = new ArrayList();
    static Mesa[] mesas;
    static Habitacion[] habitaciones;

    public static void main(String[] args) {
        mesas = new Mesa[11];
        for (int i = 1; i < mesas.length; i++) {
            mesas[i] = new Mesa();
        }
        habitaciones = new Habitacion[11];
        for (int i = 1; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion();
        }

        while (menuReserva()) {

        }
    }

    private static boolean menuReserva() {
        System.out.println("Ingrese la opción que deseas realizar: ");
        System.out.println("(1) Registrar Clientes.");
        System.out.println("(2) Clientes registrados.");
        System.out.println("(3) Realizar Reserva de Mesa.");
        System.out.println("(4) Realizar Reserva de Habitación.");
        System.out.println("(5) Liberar Mesa.");
        System.out.println("(6) Liberar habitación.");
        System.out.println("(7) Ver Servicios.");
        System.out.println("(0) Salir.");
        System.out.print("opción:");
        Scanner teclado = new Scanner(System.in);

        var opcion = 10;

        try {
            opcion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Esta opción no es valida");
        }

        switch (opcion) {
            case 1:
                clientes.add(new Cliente());
                break;
            case 2:
                registroClientes();
                break;
            case 3:
                realizarReservaMesa();
                break;
            case 4:
                realizarReservaHabitacion();
                break;
            case 5:
                liberarMesa();
                break;
            case 6:
                liberarHabitacion();
                break;
            case 7:
                verSevicios();

        }

        return opcion != 0;
    }

    public static void registroClientes() {
        System.out.println("Registro clientes: ");
        clientes.stream().map(cliente -> cliente.toString()).forEach(System.out::println);
    }

    public static void realizarReservaMesa() {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Indique la mesa que desea reservar: ");
            int mesa = teclado.nextInt();
            mesas[mesa].hacerReserva(new Cliente());
        }catch(Exception e){
            System.out.println("Esta mesa no existe.");
        }

    }

    public static void liberarMesa() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Indique la mesa que desea liberar: ");
            int mesa = teclado.nextInt();
            System.out.println("Ingrese rut: ");
            String rut = teclado.next();
            mesas[mesa].liberarServicio(rut);
        }catch(Exception e){
            System.out.println("Esta mesa no existe.");
        }

    }


    public static void realizarReservaHabitacion() {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Indique la habitación que desea reservar: ");
            int habitacion = teclado.nextInt();
            habitaciones[habitacion].hacerReserva(new Cliente());
        }catch(Exception e){
            System.out.println("Esta habitación no existe.");
        }
    }

    public static void liberarHabitacion() {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Indique la habitación que desea liberar: ");
            int habitacion = teclado.nextInt();
            System.out.println("Ingrese rut: ");
            String rut = teclado.next();
            habitaciones[habitacion].liberarServicio(rut);
        }catch(Exception e){
            System.out.println("Esta habitación no existe.");
        }
    }


    public static void verSevicios(){
        ServicioM mesas = new ServicioM();
        ServicioH habitaciones = new ServicioH();
        mesas.start();
        habitaciones.start();
    }




}
