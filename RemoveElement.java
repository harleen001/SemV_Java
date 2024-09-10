import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        
        int[] originalArray = {10, 20, 30, 40, 50};
        int elementToRemove = 30;
        int[] newArray = removeElement(originalArray, elementToRemove);
        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(newArray));
    }
    public static int[] removeElement(int[] array, int elementToRemove) {
        int indexToRemove = findIndex(array, elementToRemove);
        if (indexToRemove == -1) {
            System.out.println("Element " + elementToRemove + " not found in the array.");
            return array;
        }

        int[] newArray = new int[array.length - 1];
        
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexToRemove) {
                newArray[j++] = array[i];
            }
        }
        
        return newArray;
    }

    public static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;             }
        }
        return -1;
    }
}
