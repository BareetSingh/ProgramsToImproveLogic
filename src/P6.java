//Program to print prime numbers between 1 to 500

public class P6 {
    public static void main(String[] args) {
        int i, j;
        boolean isPrime;

        System.out.println("Prime numbers between 1 and 500 are:");

        for(i = 2; i <= 500; i++) {
            isPrime = true;

            for(j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
