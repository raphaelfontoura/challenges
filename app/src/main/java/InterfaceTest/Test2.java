package InterfaceTest;

import java.util.*;

public class Test2 {

    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("A", "B");
        List<String> l2 = new ArrayList<>();
        l2.add("A");
        l2.add("B");
        if (l1 == l2) {
            System.out.println("Equal by Address");
        } else if (l1.equals(l2)) {
            System.out.println("Equal by Content");
        } else {
            System.out.println("Not Equal either by Address or by content");
        }
    }
}
