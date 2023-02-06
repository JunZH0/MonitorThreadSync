public class Relevos {
    public synchronized void carrera(String nombre){
        System.out.println(nombre + " empieza a correr");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nombre + " termina de correr");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }
}