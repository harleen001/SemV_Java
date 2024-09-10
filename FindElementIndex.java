public class FindElementIndex {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Value to find
        int targetValue = 30;
        
        // Find the index of the target value
        int index = findIndex(numbers, targetValue);
        
        // Print the result
        if (index != -1) {
            System.out.println("Element " + targetValue + " found at index: " + index);
        } else {
            System.out.println("Element " + targetValue + " not found in the array.");
        }
    }

    // Method to find the index of a specific value in an array
    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if the target value is found
            }
        }
        return -1; // Return -1 if the target value is not found
    }
}
