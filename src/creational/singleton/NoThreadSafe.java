package creational.singleton;

public class NoThreadSafe {
    // Private static instance (will be created when first needed)
    private static NoThreadSafe instance;

    // Private constructor to prevent instantiation
    private NoThreadSafe() {}

    // Public method to provide global access to the instance
    public static NoThreadSafe getInstance() {
        if (instance == null) {
            instance = new NoThreadSafe(); // Lazy initialization
        }
        return instance;
    }
}