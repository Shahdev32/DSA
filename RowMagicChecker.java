public class RowMagicChecker {
    public static void main(String[] args) {
        // Case 1: Row-Magic array
        int[][] array1 = {
            {4, 7, 2},
            {2, 6, 5},
            {9, 3, 1}
        };
        
        // Case 2: Not Row-Magic array
        int[][] array2 = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };
        
        // Check the first array
        System.out.println("Case 1:");
        printArray(array1);
        checkRowMagic(array1);
        
        // Check the second array
        System.out.println("Case 2:");
        printArray(array2);
        checkRowMagic(array2);
    }
    
    private static void printArray(int[][] array) {
        System.out.println("Array values are:");
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
    private static void checkRowMagic(int[][] array) {
        int rowSum = sumRow(array, 0);
        boolean isRowMagic = true;
        
        for (int i = 1; i < array.length; i++) {
            if (sumRow(array, i) != rowSum) {
                isRowMagic = false;
                break;
            }
        }
        
        if (isRowMagic) {
            System.out.println("The array is Row-Magic");
        } else {
            System.out.println("The array is not Row-Magic");
        }
    }
    
    private static int sumRow(int[][] array, int rowIndex) {
        int sum = 0;
        for (int value : array[rowIndex]) {
            sum += value;
        }
        return sum;
    }
}
