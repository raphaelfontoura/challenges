package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

  static boolean isAnagram2(String a, String b) {
    String[] splitA = a.toLowerCase().split("");
    String[] splitB = b.toLowerCase().split("");
    Arrays.sort(splitA);
    Arrays.sort(splitB);
    var wordA = String.join("", splitA);
    var wordB = String.join("", splitB);
    return wordA.equals(wordB);
  }

  static boolean isAnagram(String a, String b) {
    if (a.length() != b.length())
      return false;

    char[] splitA = a.toUpperCase().toCharArray();
    char[] splitB = b.toUpperCase().toCharArray();
    int[] charsA = new int[91];
    int[] charsB = new int[91];
    for (int i = 0; i < a.length(); i++) {
      charsA[(int) splitA[i]] += 1;
      charsB[(int) splitB[i]] += 1;
    }

    for (int i = 0; i < 91; i++) {
      if (charsA[i] != charsB[i]) return false;
    }

    return true;
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }
}
