import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms in the Fibonacci series
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int terms = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci series
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            // Calculate the next Fibonacci number
            int next = first + second;
            first = 
