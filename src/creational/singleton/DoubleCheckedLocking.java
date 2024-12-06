package creational.singleton;

public class DoubleCheckedLocking {
        private static volatile DoubleCheckedLocking instance;

        private DoubleCheckedLocking() {}

        public static DoubleCheckedLocking getInstance() {
            if (instance == null) { // First check
                synchronized (DoubleCheckedLocking.class) {
                    if (instance == null) { // Second check
                        instance = new DoubleCheckedLocking();
                    }
                }
            }
            return instance;
        }

}
