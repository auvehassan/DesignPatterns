package creational.singleton;

class EarlyA {
    private static EarlyA obj = new EarlyA();//Early, instance will be created at load time

    private EarlyA() {
    }

    public static EarlyA getA() {
        return obj;
    }

    public void doSomething() {
     System.out.println("doSomething EarlyA");
    }
}  