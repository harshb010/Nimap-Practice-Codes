class Parent {
    void show() {
        System.out.println("Parent's show method");
    }

}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's overridden show method");
    }
    void Display() {
        System.out.println("Parent's Display method");
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.show();


    }
}
