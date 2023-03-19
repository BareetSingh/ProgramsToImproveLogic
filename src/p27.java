//Program to find addition on two matrices
import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the dimensions of the matrices from the user
        System.out.print("Enter the number of rows in the matrices: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns in the matrices: ");
        int cols = input.nextInt();

        // Create the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Get the values for the matrices from the user
        System.out.println("Enter the values for matrix 1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the values for matrix 2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Add the matrices
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the result
        System.out.println("The sum of the matrices is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

