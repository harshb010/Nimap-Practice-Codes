import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));
        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015));



        List<String> list = List.of("Harshal","1Nikhil","23Bhavesh","Hello");
        List<String> list1 = list.stream().filter(x -> !x.matches("^\\d.*"))
                .toList();

        System.out.println(list1);

        List<Integer> list2 = List.of(1,2,3,4,5,6,7,8,9,1,2);
        List<Integer> list3 = List.of(1,1,3,4,5,6,6,7,2,3,4);

        list2.stream().filter(x -> list3.contains(x)).distinct().forEach(System.out::println);

       

    }



    }

