class Animal {
    static void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
     static void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();  // Upcasting
        animal.eat();

        Dog dog = (Dog) animal;  // Downcasting
        dog.bark();  // Now this works!
    }
}
