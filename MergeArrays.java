import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the first array from the user
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();

        // Initialize the first array
        int[] array1 = new int[size1];

        // Get the values for the first array from the user
        System.out.println("Enter the values for the first array:");
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }

        // Get the size of the second array from the user
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();

        // Initialize the second array
        int[] array2 = new int[size2];

        // Get the values for the second array from the user
        System.out.println("Enter the values for the second array:");
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Print the first array's values
        System.out.print("First array: ");
        for (int value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Print the second array's values
        System.out.print("Second array: ");
        for (int value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Initialize the third array with the combined size of the first and second arrays
        int[] array3 = new int[size1 + size2];

        // Copy the values from the first array to the third array
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Copy the values from the second array to the third array
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // Print the third array's values
        System.out.print("The combined elements from array 1 and array 2 stored in array 3 are: ");
        for (int value : array3) {
            System.out.print(value + " ");
        }
        System.out.println();

        scanner.close();
    }
}
