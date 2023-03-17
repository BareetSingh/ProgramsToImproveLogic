//Program to find the lowest number among three numbers using the ternary operator;
import java.util.Scanner;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int lowest = (num1 < num2) ? ((num1 < num3) ? num1 : num3) : ((num2 < num3) ? num2 : num3);

        System.out.println("The lowest number is: " + lowest);
    }
}
