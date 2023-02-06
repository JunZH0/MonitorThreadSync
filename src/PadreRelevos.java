public class PadreRelevos {
    public static void main(String[] args) {
        Relevos relevos = new Relevos();
        String[] nombres = {"A", "B", "C", "D"};
        Thread[] threads = new Thread[4];
        for (int i = 0; i < 4; i++) {
            int index = i;
            threads[i] = new Thread(() -> relevos.carrera(nombres[index]));
            if (i == 0) {
                threads[i].start();
            }
        }

        for (int i = 1; i < 4; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (relevos) {
                relevos.notify();
                threads[i].start();
            }
        }

        // Wait for all threads to finish
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

