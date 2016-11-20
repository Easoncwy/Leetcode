package TwoSum_1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by eason on 16/11/18.
 */
public class Solution2 {
    public static int[] twoSum(int[] nums, int target){


        int[] res = new int[2];

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])){
                res[0] = i;
                res[1] = map.get(target - nums[i]);
            }
            map.put(nums[i],i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0};
        int target = 0;
        int[] res = twoSum(nums, target);
        System.out.println(res[0] + "," + res[1]);

    }
}
