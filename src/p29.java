//Program to find the sum of elements in an Array

public class p29 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        // Loop through each element of the array and add it to the sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // Print the sum of the array elements
        System.out.println("The sum of the elements in the array is: " + sum);
    }
}
