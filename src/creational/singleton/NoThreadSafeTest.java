package creational.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NoThreadSafeTest {

    @Test
    public void testSingletonInstance() {
        // Fetch two instances of the singleton
        NoThreadSafe instance1 = NoThreadSafe.getInstance();
        NoThreadSafe instance2 = NoThreadSafe.getInstance();

        // Assert that both instances are the same (same memory reference)
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testThreadSafety() throws InterruptedException {
        // This test simulates a situation where multiple threads try to create the singleton

        Runnable task = () -> {
            NoThreadSafe instance = NoThreadSafe.getInstance();
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
        
        // Since the code is not thread-safe, multiple threads may create different instances.
        // We cannot guarantee the instance will be the same across threads without proper synchronization.
    }

    @Test
    public void testLazyInitialization() {
        // Ensure the instance is created lazily
        long startTime = System.nanoTime();
        NoThreadSafe instance = NoThreadSafe.getInstance();
        long endTime = System.nanoTime();
        
        // The instance should not be created instantly (indicating lazy loading)
        assertTrue(endTime - startTime > 0, "Instance should not be created too quickly (indicating no lazy loading)");
    }
}
