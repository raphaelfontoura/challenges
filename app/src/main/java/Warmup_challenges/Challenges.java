package Warmup_challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Challenges {

  public static void main(String[] args) {

  }

  public static int sockMerchant(int n, List<Integer> ar) {
    int pairs = 0;
    Map<Integer, Integer> socks = new HashMap<>();
    for (Integer sock : ar) {
      if (!socks.containsKey(sock)) {
        socks.put(sock, 1);
      } else {
        socks.put(sock, socks.get(sock) + 1);
      }
    }
    for (Map.Entry<Integer, Integer> value : socks.entrySet()) {
      pairs += value.getValue() / 2;
    }
    return pairs;
  }

  public static int countingValleys(int steps, String path) {
    int altitude = 0;
    int valleys = 0;
    boolean valley = false;

    for (int i = 0; i < steps; i++) {
      if (path.charAt(i) == 'U')
        altitude += 1;
      if (path.charAt(i) == 'D')
        altitude -= 1;
      if (altitude < 0) {
        valley = true;
      }
      if (altitude >= 0 && valley) {
        valleys += 1;
        valley = false;
      }

    }

    return valleys;
  }

  public static int jumpingOnClouds(List<Integer> c) {
    int position = 0;
    int jumps = 0;
    while(position < c.size()-1) {
      if (position < c.size()-2) {
        if (c.get(position+2) == 0) {
          jumps ++;
          position += 2;
          continue;
        }
      }
      jumps++;
      position++;
    }

    return jumps;
  }

}
