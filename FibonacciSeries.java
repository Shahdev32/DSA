import java.util.Scanner;

public class FibonacciSeries {
    
    // Method to generate Fibonacci series up to N
    public static void generateFibonacci(int N) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + N + ": ");
        
        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms N: ");
        int N = scanner.nextInt();
        
        generateFibonacci(N);
        
        scanner.close();
    }
}
