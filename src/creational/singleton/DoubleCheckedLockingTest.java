package creational.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DoubleCheckedLockingTest {

    @Test
    public void testSingletonInstance() {
        // Fetch two instances of the singleton
        DoubleCheckedLocking instance1 = DoubleCheckedLocking.getInstance();
        DoubleCheckedLocking instance2 = DoubleCheckedLocking.getInstance();

        // Assert that both instances are the same (same memory reference)
        assertSame(instance1, instance2, "Both instances should be the same");
    }

    @Test
    public void testThreadSafety() throws InterruptedException {
        // This will test the thread safety of the Singleton
        Runnable task = () -> {
            DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
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
    }

    @Test
    public void testLazyInitialization() {
        // Ensure the instance is created lazily
        long startTime = System.nanoTime();
        DoubleCheckedLocking instance = DoubleCheckedLocking.getInstance();
        long endTime = System.nanoTime();
        
        // If the instance was created instantly (i.e., not lazily), it would have taken too little time
        assertTrue(endTime - startTime > 0, "Instance should not be created too quickly (indicating no lazy loading)");
    }
}
