package Ej1;

public class PadreRelevos {
    public static void main(String[] args) {
        Relevos relevos1 = new Relevos();
        relevos1.setName("Corredor 1");
        Relevos relevos2 = new Relevos();
        relevos2.setName("Corredor 2");
        Relevos relevos3 = new Relevos();
        relevos3.setName("Corredor 3");
        Relevos relevos4 = new Relevos();
        relevos4.setName("Corredor 4");

        relevos1.start();
        try {
            relevos1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        relevos2.start();
        try {
            relevos2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        relevos3.start();
        try {
            relevos3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        relevos4.start();
        try {
            relevos4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Todos los hilos han terminado");
    }
}

