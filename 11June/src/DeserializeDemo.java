import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.txt"))) {
            Student s = (Student) in.readObject();
            System.out.println("Name: " + s.name + ", Age: " + s.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
