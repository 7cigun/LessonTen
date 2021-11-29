package FruitBox;

public class Box<E extends Fruit> {

    private E[] fruitBox;
    private static final int DEFAULT_SIZE = 10;
    private int currentSize;
    private float boxWeight;

    public Box(int size) {
        this.fruitBox = (E[]) new Fruit[size];
        currentSize = 0;
    }

    public Box() {
        this(DEFAULT_SIZE);
    }

    public void add(E fruit) {
        add(fruit, currentSize);
    }

    public void add(E fruit, int index) {
        fruitBox[index] = fruit;
        currentSize++;
    }

    public void display() {
        for (E fruit : fruitBox) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }

    public float getBoxWeight() {
        boxWeight = 0.0f;
        if (fruitBox[0] instanceof Apple) {
            boxWeight = currentSize * 1.0f;
        } else {
            boxWeight = currentSize * 1.5f;
        }
        return boxWeight;
    }

    public boolean compare(Box<?> Box) {
        return Math.abs(Box.getBoxWeight() - getBoxWeight()) < 0.00001;
    }

    public void pour(Box<E> box) {
        for (int i = 0; i < currentSize; i++) {
            box.add(fruitBox[i]);
        }
        clear();
    }

    public void remove(int index) {
        fruitBox[index] = null;
        currentSize--;
    }

    public void clear() {
        for (int i = 0; i < currentSize; i++) {
            fruitBox[i] = null;
        }
        currentSize = 0;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public E get(int index) {
        System.out.println();
        return fruitBox[index];
    }

    public void removeLast() {
        remove(--currentSize);
    }

}
