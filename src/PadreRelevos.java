public class PadreRelevos {
    public static void main(String[] args) {
        Relevos relevos = new Relevos();
        String[] nombres = {"H1", "H2", "H3", "H4"};
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            int index = i;
            threads[i] = new Thread(() -> relevos.carrera(nombres[index]));
            threads[i].start();
        }

        // Espera a finalizacion de lo todos los hilos
        for (int i = 0; i < 4; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Todos los hilos han terminado");
    }
}

