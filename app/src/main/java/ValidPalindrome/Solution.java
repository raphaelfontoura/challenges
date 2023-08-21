package ValidPalindrome;

import java.util.Stack;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        int size = s.length();
        if (size == 0) return true;
        int start = 0;
        int last = size - 1;
        while (start <= last) {
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(last);
            if (! Character.isLetterOrDigit(currentFirst)) {
                start++;
            } else if (! Character.isLetterOrDigit(currentLast)) {
                last--;
            } else {
                if (currentFirst != currentLast) return false;
                start++;
                last--;
            }
        }

        return true;
    }

    public boolean isPalindrome2(String s) {
        s = s.toLowerCase().trim();
        int size = s.length();
        if (size == 0) return true;
        StringBuilder newS = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) newS.append(c);
        }
        return newS.toString().contentEquals(newS.reverse());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome2("A man, a plan, a canal: Panama"));
    }

}
