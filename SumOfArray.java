public class SumOfArray {

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = calculateSum(numbers);
        System.out.println("Sum of the array elements: " + sum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }
}
