import java.util.ArrayList;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Harshal","IT"));
        list.add(new Employee(2, "Bhavesh","DR"));
        list.add(new Employee(3, "Kunal","IT"));
        list.add(new Employee(4, "Venk","CA"));

        list.stream().filter(x -> x.getDept().equals("IT")).forEach(x -> x.setSalaried(true));

        System.out.println(list);
    }
}
