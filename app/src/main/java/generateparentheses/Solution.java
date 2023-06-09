package generateparentheses;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        bruteForce(result, 0, 0, "" , n);

        return result;
    }
    private void bruteForce(List<String> result,int open, int close, String s, int n) {

        if (open == close && open == n) {
            result.add(s);
            return;
        }
        if (open < n) {
            bruteForce(result, open+1, close, s+"(", n);
        }
        if (close < open) {
            bruteForce(result, open, close+1, s+")", n);
        }
    }
}
