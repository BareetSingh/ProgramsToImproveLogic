//Program to the product of two matrices

import java.util.Scanner;

public class p28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the dimensions of the matrices from the user
        System.out.print("Enter the number of rows in matrix 1: ");
        int rows1 = input.nextInt();
        System.out.print("Enter the number of columns in matrix 1: ");
        int cols1 = input.nextInt();
        System.out.print("Enter the number of rows in matrix 2: ");
        int rows2 = input.nextInt();
        System.out.print("Enter the number of columns in matrix 2: ");
        int cols2 = input.nextInt();

        // Check that the matrices are compatible for multiplication
        if (cols1 != rows2) {
            System.out.println("Error: The number of columns in matrix 1 must match the number of rows in matrix 2.");
            return;
        }

        // Create the matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];

        // Get the values for the matrices from the user
        System.out.println("Enter the values for matrix 1:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the values for matrix 2:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Perform matrix multiplication
        int[][] productMatrix = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                productMatrix[i][j] = sum;
            }
        }

        // Print the result
        System.out.println("The product of the matrices is:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

