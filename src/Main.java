import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Anna",14,4.5));
        students.add(new Student("Mary",15,5));
        students.add(new Student("Bob",16,2.5));

        for (Student student : students) {
            System.out.println(student.toString() + ": " + (student.isExcellent() ? "Отличник" : "Обычный студент"));
        }
    }
}