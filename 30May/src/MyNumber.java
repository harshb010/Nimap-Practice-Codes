interface printable{
    void print();
}
class MyNumber extends Number implements printable {

    private int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }

    @Override
    public void print() {
        System.out.println("Number : "+value);
    }
}

class Boxx<T extends Number & printable>{

   private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display()
    {
        item.print();
    }
}



