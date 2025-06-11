import java.io.*;

class Student implements Serializable{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializeDemo {
    public static void main(String[] args) {
        Student s = new Student("Harshal", 24);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            out.writeObject(s);
            System.out.println("Serialized successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
