package Exchange;

public class Shift<E> {
    private E[] data;
    private int currentSize;

    public Shift(int size) {
        this.data = (E[]) new Object[size];
        currentSize = 0;
    }

    public void add(E value) {
        add(value, currentSize);
    }

    public void add(E value, int index) {
        data[index] = value;
        currentSize++;
    }

    public void shiftElements(int i, int j) {
        E temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void display() {
        for (E datum : data) {
            System.out.print(datum + " ");
        }
        System.out.println();
    }
}
