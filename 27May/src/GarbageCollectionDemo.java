import java.lang.ref.WeakReference;

class Phone{
    String name;
    String model;

    public Phone(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

public class GarbageCollectionDemo {
    public static void main(String[] args) {
       // Phone phone = new Phone("Iphone","13 pro Max");
        WeakReference<Phone> phone1 = new WeakReference<>(new Phone("Iphone","12 Pro Max"));
        System.out.println(phone1.get());
        System.gc();
        System.out.println(phone1.get());
    }
}
