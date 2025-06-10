import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Anika", 22));
        students.add(new Student("Ravi", 19));
        students.add(new Student("Kiran", 25));

        Collections.sort(students);

        System.out.println(students);
    }
}
