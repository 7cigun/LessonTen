package FruitBox;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();

        apple1.display();
        orange1.display();

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);
        appleBox1.add(apple4);
        appleBox1.add(apple5);
        //appleBox1.display();
        System.out.println("В первую коробку сложили " + appleBox1.getCurrentSize() + " яблок.");
        System.out.println("Общий вес коробки: " + appleBox1.getBoxWeight());

        appleBox2.add(apple6);
        appleBox2.add(apple7);
        appleBox2.add(apple8);
        appleBox2.add(apple9);
        System.out.println("Во вторую коробку сложили " + appleBox2.getCurrentSize() + " яблок.");
        System.out.println("Общий вес коробки: " + appleBox2.getBoxWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(orange1);
        orangeBox1.add(orange2);
        orangeBox1.add(orange3);
        orangeBox1.add(orange4);
        orangeBox1.add(orange5);
        orangeBox1.add(orange6);
        System.out.println("В коробку сложили " + orangeBox1.getCurrentSize() + " апельсинов.");
        System.out.println("Общий вес коробки с апельсинами: " + orangeBox1.getBoxWeight());

        System.out.print("Сравним 1-ю коробку с яблоками и коробку с апельсинами по весу, равны ли они: ");
        System.out.println(orangeBox1.compare(appleBox1));

        System.out.println("До пересыпания коробок с яблоками: ");
        appleBox1.display();
        appleBox2.display();
        System.out.println("В первой: " + appleBox1.getCurrentSize() + " яблок");
        System.out.println("Во второй: " + appleBox2.getCurrentSize() + " яблок");
        appleBox2.pour(appleBox1);
        System.out.println("Пересыпем яблоки из одной коробки в другую: ");
        appleBox1.display();
        appleBox2.display();
        System.out.println("В первой: " + appleBox1.getCurrentSize() + " яблок");
        System.out.println("Во второй: " + appleBox2.getCurrentSize() + " яблок");

        System.out.print("Сравним 1-ю коробку с яблоками и коробку с апельсинами по весу еще раз! Равны ли они: ");
        System.out.println(orangeBox1.compare(appleBox1));

    }
}
