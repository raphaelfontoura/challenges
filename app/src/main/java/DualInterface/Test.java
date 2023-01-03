package DualInterface;

public class Test implements Left, Right {

    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }

    @Override
    public void m1() {
        Left.super.m1();
    }
}
