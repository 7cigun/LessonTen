package FruitBox;

public class Orange extends Fruit {

    private static final float FRUIT_WEIGHT = 1.5f;

    public Orange() {
        super("апельсин", FRUIT_WEIGHT);
    }

    public float getFruitWeight(){
        return FRUIT_WEIGHT;
    }
}
