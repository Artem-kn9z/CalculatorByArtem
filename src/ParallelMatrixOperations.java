import java.util.Scanner;

public class ParallelMatrixOperations {
    Scanner scanner = new Scanner(System.in);

    public void startMatrixMultiplication() {
        System.out.println("Введите количество строк первой матрицы");
        int row1 = scanner.nextInt();
        System.out.println("Введите количество столбцов первой матрицы");
        int col1 = scanner.nextInt();

        int[][] matrix1 = new int[row1][col1];

        System.out.println("Введите количество строк второй матрицы");
        int row2 = scanner.nextInt();
        System.out.println("Введите количество столбцов второй матрицы");
        int col2 = scanner.nextInt();

        int[][] matrix2 = new int[row2][col2];

        System.out.println("Введите элементы первой матрицы");
        fillMatrix(matrix1);

        System.out.println("Введите элементы второй матрицы");
        fillMatrix(matrix2);

        System.out.println("Первая матрица: ");
        printMatrix(matrix1);

        System.out.println("Вторая матрица: ");
        printMatrix(matrix2);

        int[][] result =multiplyMatricesParallel(matrix1, matrix2);

        if (result != null) {
            System.out.println("Результат умножения: ");
            printMatrix(result);
        }

    }

    public static int[][]multiplyMatricesParallel(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;

        if (col1 != row2) {
            System.out.println("Ошибка: количество столбцов первой матрицы должно совпадать с количеством строк второй матрицы.");
            return null;
        }

        int[][] result = new int[row1][col2];

        Thread[] threads = new Thread[row1*col2];
        int threadIndex = 0;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                final int row = i;
                final int col = j;
                threads[threadIndex++] = new Thread(() -> {
                    int sum = 0;
                    for (int k = 0; k < col1; k++) {
                        sum += matrix1[row][k] * matrix2[k][col];
                    }
                    result[row][col] = sum;
                });
            }
        }

        //Запуск всех потоков
        for (Thread thread : threads) {
            thread.start();
        }

        //Ожидание завершения всех потоков
        for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(String.format("%4d", matrix[i][j]));
            }
            System.out.println();
        }
    }

    public void fillMatrix(int[][] matrix ) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

}
