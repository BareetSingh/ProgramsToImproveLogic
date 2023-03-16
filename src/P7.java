//Program to print table of a given number

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        int num, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = input.nextInt();

        System.out.println("Table of " + num + " is:");

        for(i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
