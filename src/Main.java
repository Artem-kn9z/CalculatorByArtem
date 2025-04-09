import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Student student = new Student("Artem",19,5);
        persons.add(student);
        Worker worker = new Worker("Nikita", 20, "employee");
        persons.add(worker);

        for (Person person : persons) {
            person.introduce();
            if (person instanceof Student) {
                System.out.println(((Student) person).isExcellent() ? "Отличник!" : "Не отличник.");
            }
        }

        for (Person person : persons) {
            System.out.println(person);
        }

    }
}