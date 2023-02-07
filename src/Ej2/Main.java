package Ej2;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el texto: ");
        String text = scan.nextLine();
        scan.close();

        Contador counter = new Contador(0);
        ContadorVocal[] threads = new ContadorVocal[5];
        threads[0] = new ContadorVocal(counter, text, 'a');
        threads[1] = new ContadorVocal(counter, text, 'e');
        threads[2] = new ContadorVocal(counter, text, 'i');
        threads[3] = new ContadorVocal(counter, text, 'o');
        threads[4] = new ContadorVocal(counter, text, 'u');

        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }

        System.out.println("Numero de vocales: " + counter.getCount());
    }
}
