public class Main {
    public static void main(String[] args) {
    UniversityStudent student = new UniversityStudent("Anna",23,4, "MIT", 25);

    System.out.println(student.toString());

    if (student.isExcellent()) {
        System.out.println("Отличник!");
    }

    }
}