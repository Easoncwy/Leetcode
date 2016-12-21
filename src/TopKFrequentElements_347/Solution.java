package TopKFrequentElements_347;

import java.util.*;

/**
 * Created by eason on 2016/12/6.
 */

public class Solution {
    /**
     * 用 TreeMap 来实现.用所有的frequency作为 key.
     * @param nums
     * @param k
     * @return
     */

    public static List<Integer> topKFrequent(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int n:nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for (int num:map.keySet()) {
            int freq = map.get(num);
            if (!freqMap.containsKey(freq)){
                freqMap.put(freq, new LinkedList<>());
            }
            freqMap.get(freq).add(num);
        }
        List<Integer> res = new ArrayList<>();
        while (res.size() < k){

            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            res.addAll(entry.getValue());
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,4,3,4,4,3,5,5,6};
        List<Integer> res = new ArrayList<>();
        res = topKFrequent(nums, 5);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
