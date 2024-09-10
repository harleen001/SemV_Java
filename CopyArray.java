import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        // Example array
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Copy the array
        int[] copiedArray = copyArray(originalArray);
        
        // Print the original and copied arrays
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));
    }

    // Method to copy an array by iterating through it
    public static int[] copyArray(int[] array) {
        // Create a new array of the same length
        int[] newArray = new int[array.length];
        
        // Copy elements from the original array to the new array
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        
        return newArray;
    }
}
