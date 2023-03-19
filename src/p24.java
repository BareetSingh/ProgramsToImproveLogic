//Program to reverse the given string,with a user-defined function
import java.util.Scanner;

public class p24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String reversedStr = reverseString(str);
        System.out.println("The reversed string is " + reversedStr);
    }

    public static String reverseString(String str) {
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}

