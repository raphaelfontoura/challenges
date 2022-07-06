package JavaLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SimpleMath {

  public static void main(String[] args) throws IOException {
    multiplicationTable();

  }

  private static void multiplicationTable() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", N, i, N * i);
    }

    bufferedReader.close();
  }

  private static void createSeries() {
    /*
     * We use the integers , , and to create the following series:
     * 
     * You are given queries in the form of , , and . For each query, print the
     * series corresponding to the given , , and values as a single line of
     * space-separated integers.
     * 
     * Sample Input
     * 2
     * 0 2 10
     * 5 3 5
     * 
     * Sample Output
     * 2 6 14 30 62 126 254 510 1022 2046
     * 8 14 26 50 98
     */
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int i = 0; i < t; i++) {
      int a = in.nextInt();
      int b = in.nextInt();
      int n = in.nextInt();
      for (int j = 0; j < n; j++) {
        a += Math.pow(2, j) * b;
        System.out.print(a + " ");
      }
      System.out.println();
    }
    in.close();
  }
}
