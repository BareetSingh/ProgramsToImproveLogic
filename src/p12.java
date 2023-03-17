//Program to find whether a given number is Armstrong or not
import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int order = String.valueOf(num).length();
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, order);
            temp /= 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}

