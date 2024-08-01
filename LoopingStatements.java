public class LoopingStatements {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // Foreach loop
        System.out.println("\nForeach loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int doWhileCount = 1;
        do {
            System.out.println("Do-while count: " + doWhileCount);
            doWhileCount++;
        } while (doWhileCount <= 5);
    }
}
