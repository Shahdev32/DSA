public class HorizontalFlip {
    public static void main(String[] args) {
        // Original array
        int[][] originalArray = {
            {3, 7, 2},
            {8, 4, 1},
            {5, 9, 6}
        };
        
        // Print original array
        System.out.println("Original array values are:");
        printArray(originalArray);
        
        // Flip the array horizontally
        int[][] flippedArray = flipHorizontal(originalArray);
        
        // Print horizontally flipped array
        System.out.println("Horizontally flipped array is");
        printArray(flippedArray);
    }
    
    // Method to print a 2D array
    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    // Method to flip a 2D array horizontally
    private static int[][] flipHorizontal(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] flippedArray = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flippedArray[i][j] = array[i][cols - 1 - j];
            }
        }
        
        return flippedArray;
    }
}
