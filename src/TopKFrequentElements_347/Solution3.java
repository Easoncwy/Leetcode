package TopKFrequentElements_347;

import java.util.*;

/**
 * 用maxHeap实现.
 * Created by eason on 2016/12/21.
 */
public class Solution3 {

    public static List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) ->(b.getValue() - a.getValue()));
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            maxHeap.add(entry);
        }
        List<Integer> res = new ArrayList<>();
        while (res.size() < k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
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
