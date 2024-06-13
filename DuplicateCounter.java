import java.util.HashMap;
import java.util.Map;

public class DuplicateCounter {
    public static void main(String[] args) {
        // Hard-coded array values
        int[] array = {21, 9, 17, 43, 9, 15, 21, 6, 38, 6};
        
        // Print array values
        System.out.print("Array values are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Count duplicate values
        Map<Integer, Integer> valueCount = new HashMap<>();
        for (int value : array) {
            valueCount.put(value, valueCount.getOrDefault(value, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : valueCount.values()) {
            if (count > 1) {
                duplicateCount++;
            }
        }

        // Print the count of duplicate values
        System.out.println("The count of duplicate values is: " + duplicateCount);
    }
}
