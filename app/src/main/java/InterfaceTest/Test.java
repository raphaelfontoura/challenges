package InterfaceTest;

interface Interf {
    default void m1() {
        System.out.println("Interface default method");
    }
    void m2();
}
public class Test implements Interf {
    public void m1() {
        System.out.println("Test class method");
    }

    @Override
    public void m2() {
        System.out.println("Test class mandatory implementation");
    }

    public static void main(String[] args) {
        Interf i = new Test();
        i.m1();
        i.m2();
    }
}
