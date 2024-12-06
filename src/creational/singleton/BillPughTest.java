package creational.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BillPughTest {

    @Test
    public void testSingletonInstance() {
        // Fetch two instances of the singleton
        BillPugh instance1 = BillPugh.getInstance();
        BillPugh instance2 = BillPugh.getInstance();

        // Assert that both instances are the same (same memory reference)
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testThreadSafety() throws InterruptedException {
        // Runnable that fetches the singleton instance and checks that it is not null
        Runnable task = () -> {
            BillPugh instance = BillPugh.getInstance();
            assertNotNull(instance, "Instance should not be null");
        };

        // Create multiple threads that call getInstance()
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

        // Since the code is thread-safe, all threads should get the same instance.
    }

    @Test
    public void testLazyInitialization() {
        // Ensure the instance is created lazily
        long startTime = System.nanoTime();
        BillPugh instance = BillPugh.getInstance();
        long endTime = System.nanoTime();
        
        // The instance should not be created instantly (indicating lazy loading)
        assertTrue(endTime - startTime > 0, "Instance should not be created too quickly (indicating no lazy loading)");
    }
}
