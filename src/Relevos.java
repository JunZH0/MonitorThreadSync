public class Relevos {
    private int counter = 0;

    public synchronized void carrera(String nombre){
        while (counter != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombre + " empieza a correr");
        counter++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " termina de correr");
        counter--;
        notifyAll();
    }
}