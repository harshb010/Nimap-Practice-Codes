class MulitpleGenericsDemo<X, Y, Z>{
    private X roll;
    private Y name;
    private Z marks;

    public MulitpleGenericsDemo(X roll, Y name, Z marks)
    {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    X getRoll()
    {
        return roll;
    }
    Y getName()
    {
        return name;
    }
    Z getMarks()
    {
        return marks;
    }


}

public class MultipleGenericsExamaple {
    public static void main(String[] args) {
        MulitpleGenericsDemo<Integer, String, Integer> student = new MulitpleGenericsDemo<>(35,"Harshal",89);
        System.out.println(student.getRoll()+" "+student.getName()+" "+ student.getMarks());
        System.out.println(student);
    }
}
