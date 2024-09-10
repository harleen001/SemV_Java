import java.util.Arrays;

public class SortArrays {

    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 9, 1, 5, 6};
        
        // String array
        String[] stringArray = {"Banana", "Apple", "Cherry", "Mango", "Blueberry"};
        
        // Print original arrays
        System.out.println("Original Numeric Array: " + Arrays.toString(numericArray));
        System.out.println("Original String Array: " + Arrays.toString(stringArray));
        
        // Sort the arrays
        Arrays.sort(numericArray);
        Arrays.sort(stringArray);
        
        // Print sorted arrays
        System.out.println("Sorted Numeric Array: " + Arrays.toString(numericArray));
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));
    }
}
