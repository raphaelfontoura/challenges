package StringSplit;

import java.util.Scanner;

public class Solution {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String[] split = SplitLine(s);
    System.out.println(split.length);
    if (split.length != 0) {
      for (String w : split) {
        System.out.println(w);
      }
    }
    scan.close();

  }

  static String[] SplitLine(String s) {
    s = s.trim();
    if (s.isEmpty()) return new String[]{};
    String[] splitS = s.split("[ !,?._'@]+");
    return splitS;
  }

}
