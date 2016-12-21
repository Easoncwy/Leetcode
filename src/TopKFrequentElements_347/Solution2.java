package TopKFrequentElements_347;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用一个Array来把数字存放到不同的桶中.每个桶中的数字出现频率一样
 * Created by eason on 2016/12/21.
 */
public class Solution2 {
    public List<Integer> topKFrequent(int[] nums, int k){
        Map<Integer,Integer> map = new HashMap<>();
        for (int n: nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        //如果数组中只有一个数字,那么桶的索引号为1.
        List



    }


}
