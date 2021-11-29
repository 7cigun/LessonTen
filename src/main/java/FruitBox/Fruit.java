package FruitBox;

public class Fruit {
    private float fruitWeight;
    private String fruitName;

    public Fruit(String fruitName, float weight) {
        this.fruitWeight = weight;
        this.fruitName = fruitName;
    }

    public Fruit(){
    }

    public void display() {
        System.out.println("Этот фрукт - " + fruitName + ", он весит " + fruitWeight);
    }

    public float getFruitWeight(){
        return fruitWeight;
    }

    public String getFruitName(){
        return fruitName;
    }

/*    @Override
    public int compareTo(Object o) {
        return 0;
    }*/
}
