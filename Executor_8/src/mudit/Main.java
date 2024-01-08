package mudit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size pool of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Task 1: Print numbers from 1 to 5
        Runnable task1 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 1 - Count: " + i);
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Task 2: Print letters from A to E
        Runnable task2 = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Task 2 - Letter: " + c);
                try {
                    Thread.sleep(1000); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Submit tasks to the executor service
        executorService.submit(task1);
        executorService.submit(task2);

        // Shutdown the executor service after tasks are completed
        executorService.shutdown();
    }
}

