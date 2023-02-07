package Ej1;

public class Relevos extends Thread{
    private int counter = 0;

    public void run() {
        synchronized (this) {
            while (counter != 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(Thread.currentThread().getName() + " empieza a correr");
            counter++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " termina de correr");
            counter--;
            notifyAll();
        }
    }
}
