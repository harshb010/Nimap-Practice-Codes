interface Vehicle {
    void move();

    default void honk() {
        System.out.println("Beep beep!");
    }
}

class Car implements Vehicle {
    public void move() {

        System.out.println("Car is moving");
    }

    public void honk() {
        System.out.println("Hello");
    }
}

public class DefaultMethodInterface {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.move();   // Car is moving
        c.honk();   // Beep beep!  (inherited default method)
    }
}
