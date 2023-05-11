package topKElements;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionPairList {
    static class pair {
        int fst,snd;
        public pair(int fst, int snd) {
            this.fst = fst;
            this.snd = snd;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i = 0; i < nums.length; ++i) {
            counter.compute(nums[i], (ke,v) -> v == null ? 0 : v + 1);
        }
        pair[] pairList = new pair[counter.size()];
        int j = 0;
        for (Integer key : counter.keySet()) {
            int val = counter.get(key);
            //System.out.println(key + " -- " + val);
            pairList[j++] = new pair(key, val);
        }
        Arrays.sort(pairList, (a, b) -> a.snd - b.snd);

        int[] res = new int[k];
        j = 0;

        for (int i = pairList.length-1; i >= pairList.length-k; --i) {
            res[j++] = pairList[i].fst;
        }
        return res;
    }
}
