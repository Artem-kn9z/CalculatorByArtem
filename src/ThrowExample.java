public class ThrowExample {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Возраст должен быть 18+");
        }
        System.out.println("Возраст подходит");
    }

    public static void validateScore(double score){
        if (score < 0 || score > 5) {
            throw new IllegalArgumentException("Оценка должна быть от 0 до 5");
        }
    }
}
