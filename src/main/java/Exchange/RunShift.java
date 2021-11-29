package Exchange;

public class RunShift {
    public static void main(String[] args) {
        Shift<Integer> intArray = new Shift<>(5);
        intArray.add(1);
        intArray.add(2);
        intArray.add(4);
        intArray.add(3);
        intArray.add(5);

        System.out.println("Исходный целочисленный массив:");
        intArray.display();
        System.out.println("Массив после замены 2 и 3 элементов: ");
        intArray.shiftElements(2,3);
        intArray.display();
        System.out.println();

        Shift<String> stringArray = new Shift<>(5);
        stringArray.add("a");
        stringArray.add("c");
        stringArray.add("b");
        stringArray.add("d");

        System.out.println("Исходный строковый массив:");
        stringArray.display();
        System.out.println("Массив после замены 1 и 2 элементов: ");
        stringArray.shiftElements(1,2);
        stringArray.display();
    }
}
