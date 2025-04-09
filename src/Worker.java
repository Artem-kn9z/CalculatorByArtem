public class Worker extends Person {
    String work;

    public Worker() {}

    public Worker(String name, int age, String work) {
        this.name = name;
        this.age = age;
        this.work = work;
    }

    public void setWorker(String name, int age, String work){
        this.name = name;
        this.age = age;
        this.work = work;
    }

    @Override
    public void introduce() {
        System.out.println("Я работник, меня зовут " + name);
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                ", age=" + age +
                '}';
    }
}
