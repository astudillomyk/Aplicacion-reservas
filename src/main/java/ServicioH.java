public class ServicioH extends Thread{
    static Habitacion[] habitaciones;

    @Override
    public void run() {
        habitaciones = new Habitacion[11];
        for (int i = 1; i < habitaciones.length; i++) {
            habitaciones[i] = new Habitacion();
        }
        String mostrar = "";
        boolean hayDisponibles = false;
        for (int i = 1; i < habitaciones.length; i++) {
            if (habitaciones[i].estaDisponible(mostrar)) {
                System.out.println("- Habitación #" + i);
                hayDisponibles = true;
            }
            if (!hayDisponibles) {
                System.out.println("Esta habitación no esta disponible.");
            }
        }
    }



    }

