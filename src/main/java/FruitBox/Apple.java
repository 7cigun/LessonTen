package FruitBox;

public class Apple extends Fruit {

    private static final float FRUIT_WEIGHT = 1.0f;

    public Apple() {
        super("яблоко", FRUIT_WEIGHT);

    }

    public float getFruitWeight(){
        return FRUIT_WEIGHT;
    }
}
