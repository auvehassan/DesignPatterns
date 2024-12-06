package creational.singleton;

public class BillPugh {
    private BillPugh() {}

    // Inner static class responsible for holding the Singleton instance
    private static class SingletonHelper {
        // This is the instance created at the time of class loading
        private static final BillPugh INSTANCE = new BillPugh();
    }

    // Public method to access the instance
    public static BillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
