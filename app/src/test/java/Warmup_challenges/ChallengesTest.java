package Warmup_challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ChallengesTest {
  
  @Test void  sockMerchant_shouldReturn_2 () {
    int n = 7;
    List<Integer> ar = Arrays.asList(1,2,1,2,1,3,2);

    var result = Challenges.sockMerchant(n, ar);

    assertEquals(2, result);
  }

  @Test void countingValleys_shouldReturn_1(){
    int steps = 8;
    String path = "UDDDUDUU";

    var result = Challenges.countingValleys(steps, path);

    assertEquals(1, result);
  }

  @Test void countingValleys_shouldReturn_2(){
    int steps = 12;
    String path = "DDUUDDUDUUUD";

    var result = Challenges.countingValleys(steps, path);

    assertEquals(2, result);
  }

  @Test void jumpingOnClouds_shouldReturn_4(){
    List<Integer> c = Arrays.asList(0,0,1,0,0,1,0);

    var result = Challenges.jumpingOnClouds(c);

    assertEquals(4, result);
  }

  @Test void jumpingOnClouds_shouldReturn_3(){
    List<Integer> c = Arrays.asList(0,0,0,0,1,0);

    var result = Challenges.jumpingOnClouds(c);

    assertEquals(3, result);
  }

  @Test void jumpingOnClouds_shouldReturn_another3(){
    List<Integer> c = Arrays.asList(0,0,0,1,0,0);

    var result = Challenges.jumpingOnClouds(c);

    assertEquals(3, result);
  }
}
