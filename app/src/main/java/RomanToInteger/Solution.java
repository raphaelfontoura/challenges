package RomanToInteger;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {

        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int a=map.get(ch);

            if(i+1<s.length()){
                int b=map.get(s.charAt(i+1));

                if(a>=b){
                    sum=sum+a;
                }
                else{
                    sum=sum-a;
                }
            }
            else{
                sum=sum+a;
            }
        }
        return sum;
    }

//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        int iii = solution.romanToInt("III");
//        int lviii = solution.romanToInt("LVIII");
//        int mcmxciv = solution.romanToInt("MCMXCIV");
//
//        System.out.println(iii == 3);
//        System.out.println(lviii == 58);
//        System.out.println(mcmxciv == 1994);
//
//    }
}