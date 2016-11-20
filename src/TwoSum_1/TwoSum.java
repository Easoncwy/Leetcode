package TwoSum_1;

import java.util.*;

/**
 * Created by eason on 16/11/18.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int figure = target - nums[i];

            if (map.containsKey(figure) && map.get(figure) != i){

                res[0] = i;
                res[1] = map.get(figure);
            }
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
