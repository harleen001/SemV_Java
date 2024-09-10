import java.util.Arrays;

public class InsertElementIn2DArray {

    public static void main(String[] args) {
        // Example 2D array
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Element to insert
        int elementToInsert = 99;
        
        // Position to insert the element (row, column)
        int row = 1; // Row index
        int col = 2; // Column index
        
        // Insert the element and get the new 2D array
        int[][] newArray = insertElement(originalArray, elementToInsert, row, col);
        
        // Print the original and new 2D arrays
        System.out.println("Original Array:");
        print2DArray(originalArray);
        
        System.out.println("New Array after insertion:");
        print2DArray(newArray);
    }

    // Method to insert an element at a specific position in a 2D array
    public static int[][] insertElement(int[][] array, int element, int row, int col) {
        // Check if the position is valid
        if (row < 0 || row >= array.length || col < 0 || col >= array[row].length) {
            System.out.println("Invalid position.");
            return array;
        }

        // Create a new 2D array with the same dimensions
        int[][] newArray = new int[array.length][];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = Arrays.copyOf(array[i], array[i].length);
        }

        // Insert the element at the specified position
        newArray[row][col] = element;

        return newArray;
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
