abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);

    }

    void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
    }
}
