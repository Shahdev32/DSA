import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Hard-coded array values
        int[] array = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};

        // Print original array values
        System.out.print("Original array is: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Remove duplicate values
        Set<Integer> set = new LinkedHashSet<>();
        for (int value : array) {
            set.add(value);
        }

        // Convert the set back to an array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        // Print new array values
        System.out.print("Array after removing duplicates is: ");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
            if (i < newArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Print sizes of the original and new arrays
        System.out.println("The size of the original array was: " + array.length);
        System.out.println("The size of the new array is: " + newArray.length);
    }
}
