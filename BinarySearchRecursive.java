public class BinarySearchRecursive {
    
    // Recursive binary search method
    public static int binarySearch(int[] array, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if the target is present at mid
            if (array[mid] == target) {
                return mid;
            }
            
            // If the target is smaller than mid, it can only be present in the left subarray
            if (array[mid] > target) {
                return binarySearch(array, left, mid - 1, target);
            }
            
            // Else the target can only be present in the right subarray
            return binarySearch(array, mid + 1, right, target);
        }
        
        // Target is not present in the array
        return -1;
    }
    
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        
        int result = binarySearch(array, 0, array.length - 1, target);
        
        if (result == -1) {
            System.out.println("Element not present in array");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}
