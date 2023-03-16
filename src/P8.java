//Program to print table from 1 to 10

public class P8 {
    public static void main(String[] args) {
        int i, j;

        for(i = 1; i <= 10; i++) {
            System.out.println("Table of " + i + " is:");

            for(j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }

            System.out.println();
        }
    }
}
