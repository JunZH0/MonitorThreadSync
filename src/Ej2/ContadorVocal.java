package Ej2;

public class ContadorVocal extends Thread{
    private Contador cont;
    private String text;
    private char vowel;

    public ContadorVocal(Contador cont, String text, char vowel) {
        this.cont = cont;
        this.text = text;
        this.vowel = vowel;
    }

    @Override
    public void run() {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == vowel) {
                cont.increment();
            }
        }
    }
}
