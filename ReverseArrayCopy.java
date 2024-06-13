import java.util.Scanner;

public class ReverseArrayCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Initialize the first array
        int[] firstArray = new int[size];
        
        // Get the values for the first array from the user
        System.out.println("Enter the values for the array:");
        for (int i = 0; i < size; i++) {
            firstArray[i] = scanner.nextInt();
        }
        
        // Print the first array's values
        System.out.print("First array: ");
        for (int value : firstArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        // Initialize the second array with the same size
        int[] secondArray = new int[size];
        
        // Copy the values from the first array to the second array in reverse order
        for (int i = 0; i < size; i++) {
            secondArray[i] = firstArray[size - 1 - i];
        }
        
        // Print the second array's values
        System.out.print("Second array (reversed): ");
        for (int value : secondArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
