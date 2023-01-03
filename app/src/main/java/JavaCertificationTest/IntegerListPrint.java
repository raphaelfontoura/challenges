package JavaCertificationTest;

import java.util.ArrayList;
import java.util.List;

public class IntegerListPrint {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (Integer i: list) {
            if (i != 10) {
                continue;
            }
            System.out.print(i);
        }
    }
}
