import java.util.Scanner;

public class DoubleArraysExample {
    public void enterAndPrintDoubleArray(){
        int num = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите количество строк: ");
        int row = sc.nextInt();
        System.out.println("Введите количество столбцов: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = num++;
            }
        }

        System.out.println("Массив: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(String.format("%4d", arr[i][j]));
            }
            System.out.println();
        }

        System.out.println("Транспонированная матрица: ");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(String.format("%4d",arr[j][i]));
            }
            System.out.println();
        }

        sc.close();
    }
}
