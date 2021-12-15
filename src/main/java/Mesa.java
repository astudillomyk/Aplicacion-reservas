public class Mesa implements Reservable {
    private Cliente[] clientes;


    public Mesa() {
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
            System.out.println("Esta mesa ya esta reservada.");
        } else {
            clientes[r] = cliente;
            System.out.println("Reserva completa");
        }
    }

    public void liberarServicio(String rut) {
        int r = guardarRut(rut);
        if (clientes[r] != null) {
            if (clientes[r].getRut().equals(rut)) {
                clientes[r] = null;
                System.out.println("Mesa Liberada.");
            } else
                System.out.println("El rut no corresponde con ningúna reserva.");
        } else
            System.out.println("No hay reserva.");
    }

    public boolean estaDisponible(String rut) {
        return clientes[guardarRut(rut)] == null;
    }



}
