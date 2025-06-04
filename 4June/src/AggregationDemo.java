import java.util.ArrayList;
import java.util.List;

class Professor {
    String name;
    Professor(String name) { this.name = name; }
}

class Department {
    String name;
    List<Professor> professors; // Aggregation

    Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    void showProfessors() {
        for (Professor p : professors) {
            System.out.println(name + " Department has Professor " + p.name);
        }
    }
}

public class AggregationDemo {
    public static void main(String[] args) {
        Professor p1 = new Professor("Dr. John");
        Professor p2 = new Professor("Dr. Sarah");

        List<Professor> professorList = new ArrayList<>();
        professorList.add(p1);
        professorList.add(p2);

        Department department = new Department("Computer Science", professorList);
        department.showProfessors();
    }
}
