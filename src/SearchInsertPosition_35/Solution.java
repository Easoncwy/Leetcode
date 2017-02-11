package SearchInsertPosition_35;

/**
 * Created by eason on 2017/2/11.
 * silly solution
 */
public class Solution {
    public static int searchInsert(int[] nums, int target){
        int index = 0;
        if ((nums == null) || (nums.length == 0) || (target < nums[0])){
            index = 0;
        }

        if (target > nums[nums.length - 1]){
            index = nums.length;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1){
                if (nums[i] == target){
                    index = i;
                    break;
                }else if ((nums[i] < target) && (target < nums[i + 1])){
                    index = i + 1;
                    break;
                }else {
                    continue;
                }
            }else {
                if (nums[i] == target)
                    index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int index = searchInsert(nums, target);
        System.out.println(index);

    }


}
