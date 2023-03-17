//Program to print Armstrong numbers between 1 and 500
public class p13 {

    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {
            int sum = 0;
            int num = i;
            int digits = String.valueOf(i).length();

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, digits);
                num /= 10;
            }

            if (i == sum) {
                System.out.print(i + " ");
            }
        }
    }
}

