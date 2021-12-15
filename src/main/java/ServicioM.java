public class ServicioM extends Thread {
    static Mesa[] mesas;

    @Override
    public void run() {
        mesas = new Mesa[11];
        for (int i = 1; i < mesas.length; i++) {
            mesas[i] = new Mesa();
        }
        String mostrar = "";
        boolean hayDisponibles = false;
        for (int i = 1; i < mesas.length; i++) {
            if (mesas[i].estaDisponible(mostrar)) {
                System.out.println("- Mesa #" + i);
                hayDisponibles = true;
            }
            if (!hayDisponibles) {
                System.out.println("Esta mesa no esta disponible.");
            }
        }

    }


}
