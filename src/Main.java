import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        System.out.println("Rows: ");
        int rows = sc.nextInt();
        System.out.println("Columns:");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element (" + i + ", " + j + "):");
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf("%-5d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter column:");
        int column = sc.nextInt();
        if (column < columns) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += matrix[i][column];
            }
            System.out.println("Sum: " + sum);
        } else {
            System.out.println("Column not found");
        }
    }
}