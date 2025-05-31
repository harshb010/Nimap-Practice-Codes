public class School {

    void announceClass() {
        class Classroom {
            void sayHello() {
                System.out.println("Local Inner Class: Welcome to Classroom 101");
            }
        }

        Classroom classroom = new Classroom();
        classroom.sayHello();
    }

    public static void main(String[] args) {
        School school = new School();
        school.announceClass();
    }
}
