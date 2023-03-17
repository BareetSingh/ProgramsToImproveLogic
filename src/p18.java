//Program to find the largest number among three numbers using conditional operator
import java.util.Scanner;

public class p18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int largest = (num1 > num2 && num1 > num3) ? num1 : ((num2 > num3) ? num2 : num3);

        System.out.println("The largest number is: " + largest);
    }
}
