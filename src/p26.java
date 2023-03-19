//Program to count words in a sentence,with a user-defined function

import java.util.Scanner;

public class p26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();

        int wordCount = countWords(sentence);
        System.out.println("The number of words in the sentence is " + wordCount);
    }

    public static int countWords(String sentence) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isLetter(ch)) {
                if (!inWord) {
                    inWord = true;
                    wordCount++;
                }
            } else {
                inWord = false;
            }
        }
        return wordCount;
    }
}
