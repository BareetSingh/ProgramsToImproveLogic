//Program to find given number prime or not

import java.util.Scanner;

public class P5a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int i = 2;
        for ( ; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Not a Prime Number");
                break;
            }
        }

        if (i == number) {
            System.out.println("It's a Prime Number");
        }
    }
}

