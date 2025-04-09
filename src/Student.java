public class Student extends Person {
    private double averageScore;

    @Override
    public void introduce() {
        System.out.println("Я студент по имени " + name);
    }

    public Student() {
    }

    public Student(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public boolean isExcellent() {
        return averageScore >= 4.5;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", averageScore=" + averageScore +
                '}';
    }

    public void setData(String name, int age, double averageScore) {
        this.name = name;
        this.age = age;
        this.averageScore = averageScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
