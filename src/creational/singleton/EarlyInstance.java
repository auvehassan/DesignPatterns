package creational.singleton;

class EarlyInstance {
    private static final EarlyInstance obj = new EarlyInstance(); //Early, instance will be created at load time

    private EarlyInstance() {
    }

    public static EarlyInstance getA() {
        return obj;
    }

    public void doSomething() {
     System.out.println("doSomething EarlyA");
    }
}  