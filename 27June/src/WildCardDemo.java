import java.util.*;

class WildcardDemo {

    public static void printList(List<?> list) {
        System.out.println("Unbounded Wildcard - Printing list:");
        for (Object obj : list) {
            System.out.println(obj);
        }

    }

    public static void printNumbers(List<? extends Number> list) {
        System.out.println("Upper Bounded Wildcard - Printing numbers:");
        for (Number number : list) {
            System.out.println(number);
        }
    }

    public static void addIntegers(List<? super Integer> list) {
        System.out.println("Lower Bounded Wildcard - Adding integers:");
        list.add(100);
        list.add(200);
        list.add(300);
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Java", "Python", "C++");
        WildcardDemo.printList(stringList);

        System.out.println();

        List<Integer> intList = Arrays.asList(10, 20, 30);
        WildcardDemo.printNumbers(intList);

        System.out.println();

        List<Number> numberList = new ArrayList<>();
        WildcardDemo.addIntegers(numberList);
    }
}
