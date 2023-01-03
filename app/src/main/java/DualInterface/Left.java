package DualInterface;

public interface Left {
    default void m1() {
        System.out.println("Left");
    }
}
