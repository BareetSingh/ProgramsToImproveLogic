//Program to find HCF and LCM of a given number
import java.util.Scanner;

public class p22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int hcf = findHCF(num1, num2);
        int lcm = findLCM(num1, num2, hcf);

        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is " + lcm);
    }

    public static int findHCF(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        return num1;
    }

    public static int findLCM(int num1, int num2, int hcf) {
        int lcm = (num1 * num2) / hcf;
        return lcm;
    }
}
