import java.util.ArrayList;
import java.util.List;

public class CompareDemo {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(2,"Harshal",3.6));
        students.add(new Student(8,"Venk",3.9));
        students.add(new Student(4,"Harsh",4.0));
        students.add(new Student(6,"Venkatesh",3.2));
        students.sort((a,b)->{
            if(a.cgpa() - b.cgpa()>0)
            {
                return -1;
            } else if (a.cgpa() - b.cgpa() < 0) {
                return 1;
            }else {
                return 0;
            }
        });

        for(Student s : students)
        {
            System.out.println(s.id()+" "+s.name()+" "+s.cgpa());
        }

    }
}
