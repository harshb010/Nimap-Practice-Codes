//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A{


    A()
    {
        System.out.println("A constructor");
    }



    static{
        System.out.println("Static Block");
    }

    public static void show()
    {
        System.out.println("Static Method");
    }


}

public class Main {
    public static void main(String[] args) {
            A a;
            A.show();


        }
}
