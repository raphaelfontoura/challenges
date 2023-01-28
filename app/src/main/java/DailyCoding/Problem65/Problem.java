package DailyCoding.Problem65;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Amazon.
 *
 * Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.
 */
public class Problem {
    public static void main(String[] args) {
        int[][] numbers3 = {{1,2},{3,4}};
        //00 01 11 10
        int[][] numbers4 = {{1,2},{3,4},{5,6}};
        //00 01 11 21 20 10
        int[][] numbers5 = {{1,2,3},{4,5,6}};
        //00 01 02 12 11 10
        int[][] numbers6 = {{1, 2, 3}, {6, 7, 8}, {11, 12, 13}};
        //00 01 02 12 22 21 20 10 11
        int[][] numbers = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};

        Problem problem = new Problem();
        List<Integer> clockwiseSpiral = problem.getClockwiseSpiral(numbers);
        clockwiseSpiral.forEach(System.out::println);

    }
    public List<Integer> getClockwiseSpiral(int[][] numbers) {
        List<Integer> result = new ArrayList<>();
        int rows = numbers.length;
        int cols = numbers[0].length;
        int top = 0, left = 0, bottom = rows -1, right = cols - 1;
        char dir = 'L';
        while (top <= bottom && left <= right) {
            switch (dir) {
                case 'L':
                    for (int i = left; i <= right; i++) {
                        result.add(numbers[top][i]);
                    }
                    top++;
                    dir = 'D';
                    break;
                case 'D':
                    for (int i = top; i <= bottom; i++) {
                        result.add(numbers[i][right]);
                    }
                    right--;
                    dir = 'R';
                    break;
                case 'R':
                    for (int i = right; i >= left; i--) {
                        result.add(numbers[bottom][i]);
                    }
                    bottom--;
                    dir = 'U';
                    break;
                case 'U':
                    for (int i = bottom; i >= top; i--) {
                        result.add(numbers[i][left]);
                    }
                    left++;
                    dir = 'L';
                    break;
            }
        }
        return result;
    }
}
