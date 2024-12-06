package creational.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EarlyInstanceTest {

    @Test
    public void testSingletonInstance() {
        // Fetch two instances of the singleton
        EarlyInstance instance1 = EarlyInstance.getA();
        EarlyInstance instance2 = EarlyInstance.getA();

        // Assert that both instances are the same (same memory reference)
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testThreadSafety() throws InterruptedException {
        // Runnable that fetches the singleton instance and calls a method on it
        Runnable task = () -> {
            EarlyInstance instance = EarlyInstance.getA();
            assertNotNull(instance, "Instance should not be null");
        };

        // Create multiple threads that call getA()
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();
        
        // Since the code is thread-safe (due to eager initialization), all threads should get the same instance.
    }

    @Test
    public void testDoSomething() {
        // Get the singleton instance
        EarlyInstance instance = EarlyInstance.getA();
        
        // Call the doSomething() method and check if the correct output is printed
        // Note: Since we're printing to console, we could use a ByteArrayOutputStream to capture the output
        // for assertion.
        
        // Using System.setOut to capture the printed output
        var outputStream = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outputStream));
        
        // Call the method
        instance.doSomething();

        // Verify the output
        assertEquals("doSomething EarlyA\n", outputStream.toString(), "The output of doSomething() should match");
        
        // Reset System.out to its original state
        System.setOut(System.out);
    }
}
