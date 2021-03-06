package JavaDequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    Set<Integer> set = new HashSet<>();
    
    int n = in.nextInt();
    int m = in.nextInt();
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < n; i++) {
        int input = in.nextInt();
        
        deque.add(input);
        set.add(input);
        
        if (deque.size() == m) {
            if (set.size() > max) max = set.size();
            int first = deque.remove();
            if (!deque.contains(first)) set.remove(first);
        }
    }
    
    System.out.println(max);
}
}
