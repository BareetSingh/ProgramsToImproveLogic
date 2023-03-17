//Program to find the product of digits in a number
import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer num = sc.nextInt();
        int p = 1;
        while(num!=0)
        {
            p=p*(num%10);
            num=num/10;
        }
        System.out.println("The product of digits in " + num + " is " + p);
    }
}
