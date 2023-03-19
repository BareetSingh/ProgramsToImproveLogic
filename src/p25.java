//Program to count vowels in a string

import java.util.Scanner;

public class p25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int vowelCount = countVowels(str);
        System.out.println("The number of vowels in the string is " + vowelCount);
    }

    public static int countVowels(String str) {
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
