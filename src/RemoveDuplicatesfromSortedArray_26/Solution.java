package RemoveDuplicatesfromSortedArray_26;

/**
 * Created by eason on 16/12/1.
 */
public class Solution {
    public static int removeDuplicate(int[] nums){
        int pre = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pre] != nums[i]){
                ++pre;
                nums[pre] = nums[i];
            }
        }
        return pre + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,2};
        int count = removeDuplicate(nums);
        System.out.println(count);
        System.out.println("**********************");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }


}
