package TopKFrequentElements_347;

import java.util.*;

/**
 * 用一个Array来把数字存放到不同的桶中.每个桶中的数字出现频率一样
 * Created by eason on 2016/12/21.
 */
public class Solution2 {
    public static List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //如果数组中只有一个数字,那么桶的索引号为1.
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int n:map.keySet()) {
            int freq = map.get(n);
            if (buckets[freq] == null)
                buckets[freq] = new LinkedList<>();
            buckets[freq].add(n);
        }

        List<Integer> res = new LinkedList<>();
        for (int i = buckets.length - 1; i > 0 && k >0; --i) {
            if (buckets[i] != null){
                List<Integer> list = buckets[i];
                res.addAll(list);
                k -= list.size();
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,4,3,4,4,3,5,5,6};
        List<Integer> res = new ArrayList<>();
        res = topKFrequent(nums, 4);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }


}
