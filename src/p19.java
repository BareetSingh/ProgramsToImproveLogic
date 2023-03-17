//Program to calculate the power of a given number through user define a function

import java.util.Scanner;

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }

    static double power(double base, int exponent) {
        double result = 1;
        while (exponent != 0) {
            result = result * base;
            exponent--;
        }

        return result;
    }
}

