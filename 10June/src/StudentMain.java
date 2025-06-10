import java.util.*;

class Student1 {
    String name;
    int age;

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

class SortByName implements Comparator<Student1> {
    public int compare(Student1 a, Student1 b) {
        return a.name.compareTo(b.name);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        List<Student1> students = List.of(
                new Student1("Kiran", 25),
                new Student1("Anika", 22),
                new Student1("Ravi", 19)
        );

        List<Student1> sortedList = new ArrayList<>(students);
        Collections.sort(sortedList, new SortByName());

        System.out.println("Sorted by Name: " + sortedList);
    }
}
