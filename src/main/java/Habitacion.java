public class Habitacion implements Reservable {

    private Cliente[] clientes;

    public Habitacion() {
        clientes = new Cliente[100];
    }

    private int guardarRut(String rut) {
        if (rut.equals("")) {
            return 0;
        }
        return 1;
    }

    public void hacerReserva(Cliente cliente) {
        int r = guardarRut(cliente.getRut());
        if (clientes[r] != null) {
            System.out.println("Esta habitación ya esta reservada");
        }else {
            clientes[r] = cliente;
            System.out.println("Reserva completa");
        }
    }

    public void liberarServicio(String rut) {
        int l = guardarRut(rut);
        if (clientes[l] != null) {
            if (clientes[l].getRut().equals(rut)) {
                clientes[l] = null;
                System.out.println("Habitación Liberada.");
            } else
                System.out.println("El rut no corresponde con ningúna reserva.");
        } else {
            System.out.println("No hay reserva.");
        }
    }

    public boolean estaDisponible(String rut) {
        return clientes[guardarRut(rut)] == null;
    }
}
