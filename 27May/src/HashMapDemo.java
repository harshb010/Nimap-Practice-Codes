import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
       Map<Student, String> map = new HashMap<>();
       Student s1 = new Student(1,"Harshal");
       Student s2 = new Student(2,"Ganesh");
       Student s3 = new Student(1,"Harshal");

       map.put(s1, "Doctor");
       map.put(s2, "Engineer");
       map.put(s3,"Manager");

        System.out.println(map);
    }
}
class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
