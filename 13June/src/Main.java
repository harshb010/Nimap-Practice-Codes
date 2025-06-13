class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound();            // Accessible: Animal method

        Dog d = (Dog) a;
        d.bark();             // Accessible: Dog-specific method
    }
}
