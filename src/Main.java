import javax.naming.InvalidNameException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        try {
            Student s1 = new Student("Artem",19,5);
            Student s2 = new Student("Mary",14,-1);
            persons.add(s1);
            persons.add(s2);
        } catch (InvalidStudentDataException e) {
            System.out.println("Ошибка при создании студента" + e.getMessage());;
        }

        Worker worker = new Worker("Nikita", 20, "employee");
        persons.add(worker);

        for (Person person : persons) {
            person.introduce();
        }
    }
}