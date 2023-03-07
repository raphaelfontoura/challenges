package predicate;

import java.util.Arrays;
import java.util.List;

public class PredicationStringLength {
    public static void main(String[] args) {
        String arr[] = {"*", "**", "***", "****", "*****", "******"};
        Predicate<String> pr1 = s -> s.length() < 4;
        print(arr, pr1);

        List<String> list1 = Arrays.asList("A","C");
        List<String> list2 = Arrays.asList("B","D");
        list1.addAll(1, list2);
        System.out.println(list1);

    }

    private static void print(String[] arr, Predicate<String> predicate) {
        for (String str: arr) {
            if (predicate.test(str)) System.out.println(str);
        }
    }
}
