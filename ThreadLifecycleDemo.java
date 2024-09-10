public class ThreadLifecycleDemo {

    public static void main(String[] args) {
        // Create a new thread object
        Thread thread = new Thread(new Task());

        // Print initial state (New)
        System.out.println("Initial State: " + thread.getState());

        // Start the thread
        thread.start();

        // Print state after starting (Runnable/Blocked/Waiting)
        try {
            Thread.sleep(100); // Ensure thread starts and moves to runnable state
            System.out.println("State after start: " + thread.getState());

            // Wait for the thread to complete
            thread.join();

            // Print state after thread completes (Terminated)
            System.out.println("State after completion: " + thread.getState());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Create and start another thread to demonstrate interrupt
        Thread interruptThread = new Thread(new InterruptTask());
        interruptThread.start();

        try {
            Thread.sleep(500); // Allow some time for the thread to start
            interruptThread.interrupt(); // Interrupt the thread
            interruptThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// Task class demonstrating various thread states
class Task implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Task is running. Current State: " + Thread.currentThread().getState());
            Thread.sleep(2000); // Simulate work
            System.out.println("Task is completed. Current State: " + Thread.currentThread().getState());
        } catch (InterruptedException e) {
            System.out.println("Task was interrupted.");
        }
    }
}

// Task class to demonstrate interrupt handling
class InterruptTask implements Runnable {
    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("InterruptTask is running. Current State: " + Thread.currentThread().getState());
                Thread.sleep(1000); // Simulate work
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptTask was interrupted.");
        }
    }
}
