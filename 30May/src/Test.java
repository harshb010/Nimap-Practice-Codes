
public class Test
{
    public static void main(String[] args) {
        MyNumber num = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<MyNumber>(num);
        box.display();
    }
}
