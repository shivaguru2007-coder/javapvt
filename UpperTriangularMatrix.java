import java.util.Scanner;

public class UpperTriangularMatrix {
    
    public static void getMatrix(int[][] matrix, int rows, int cols) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void upperMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Upper Triangular Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i > j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void lowerMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("Lower Triangular Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i < j) {
                    System.out.print("0 ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        if (rows != cols) {
            System.out.println("Error: The matrix must be square!");
            return;
        }

        int[][] matrix = new int[rows][cols];

        getMatrix(matrix, rows, cols);
        printMatrix(matrix, rows, cols);
        upperMatrix(matrix, rows, cols);
        lowerMatrix(matrix, rows, cols);
    }
}
