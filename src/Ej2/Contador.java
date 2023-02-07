package Ej2;

public class Contador {
    private int count;

    public Contador(int count) {
        this.count = count;
    }

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }


}
