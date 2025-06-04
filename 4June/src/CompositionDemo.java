class Engine {
    Engine() { System.out.println("Engine created."); }
}

class Car {
    private Engine engine;

    Car() {
        this.engine = new Engine();
        System.out.println("Car is ready.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car();
    }
}
