package creational.singleton;

class LazyA {
    private static LazyA obj;

    private LazyA() {
    }

    public static LazyA getA() {
        if (obj == null) {
            synchronized (LazyA.class) {
                if (obj == null) {
                    obj = new LazyA();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething() {
        System.out.println("doSomething LazyA");

    }
}  