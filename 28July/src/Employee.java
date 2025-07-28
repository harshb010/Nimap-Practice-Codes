public class Employee {
    int id;
    String name;
    String dept;
    boolean isSalaried = false;

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isSalaried() {
        return isSalaried;
    }

    public void setSalaried(boolean salaried) {
        isSalaried = salaried;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", isSalaried=" + isSalaried +
                '}';
    }
}
