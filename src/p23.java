//Program to find the length of a string,with a user-defined function

import java.util.Scanner;
public class p23 {
    public static void main(String[] args) {
        String str;
        int len = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the String: ");
        str = scan.nextLine();

        char[] strChars = str.toCharArray();
        for (char ch : strChars)
            len++;

        System.out.println("\nLength of String = " + len);
    }
}
