public class AverageofArray {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40, 50};
        
        // Calculate the average
        double average = calculateAverage(numbers);
        
        // Print the result
        System.out.println("Average of the array elements: " + average);
    }

    // Method to calculate the average of an array
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        
        return (double) sum / array.length;
    }
}

