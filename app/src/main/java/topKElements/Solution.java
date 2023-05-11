package topKElements;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var mapNumbers = new HashMap<Integer, Integer>();
        for (int number : nums) {
            mapNumbers.put(number, mapNumbers.getOrDefault(number, 0) + 1);
        }
        var filter = mapNumbers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toList();
        var result = new int[k];
        var max = filter.size() - 1;
        for (int i = 0; i < k; i++) {
            result[i] = filter.get(max);
            max--;
        }
        return result;
    }

    public int[] topKFrequentCopy(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        HashMap<Integer, List<Integer>> countMap = new HashMap<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(countMap.containsKey(entry.getValue())) countMap.get(entry.getValue()).add(entry.getKey());
            else countMap.put(entry.getValue(), new ArrayList<>(Arrays.asList(entry.getKey())));
        }
        for(int i = 0, j = nums.length - map.size() + 1; i < k; i++){
            for(; j > 0; j--){
                if(!countMap.containsKey(j)) continue;
                for(int val : countMap.get(j)){
                    res[i++] = val;
                }
                i--;
                j--;
                break;
            }
        }
        return res;
    }

    public int[] topKFrequentCopy2(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)) map.put(num, 1);
            else map.put(num, map.get(num) + 1);
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((int[] a, int[] b) -> b[1] - a[1]);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            q.add(new int[]{entry.getKey(), entry.getValue()});
        }
        while(k-- > 0){
            res[k] = q.remove()[0];
        }
        return res;
    }

}