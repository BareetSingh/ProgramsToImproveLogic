//Program to find the cube root of a given number

import java.util.Scanner;

public class p21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double cubeRoot = Math.pow(num, 1.0 / 3.0);

        System.out.println("Cube root of " + num + " is " + cubeRoot);
    }
}
