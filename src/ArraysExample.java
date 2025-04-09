import java.util.Scanner;

public class ArraysExample {
    public void enterAndPrintArray(){
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Массив: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length-1 ? arr[i] + "." : arr[i] + ", ");
        }
        sc.close();
    }
}
