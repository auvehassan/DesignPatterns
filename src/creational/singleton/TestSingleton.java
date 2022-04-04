package creational.singleton;

public class TestSingleton {
    public static void main(String[] args) {
        EarlyA earlyA = EarlyA.getA();
        LazyA lazyA = LazyA.getA();

        earlyA.doSomething();
        lazyA.doSomething();
    }
}
