package RotateArray_189;

/**
 * Created by eason on 2017/1/1.
 */

public class Solution {
    /**
     * 方法一
     * 1.将整个数组旋转,掉个头
     * 2.将前k个数旋转,掉个头
     * 3.将后nums.length - k个数旋转,掉个头
     *
     * 将
     * @param nums
     * @param k
     */
    public static void rotate(int[] nums, int k){
        if ((nums == null) || (nums.length < 2))
            return;

        k = k % nums.length;

        int len = nums.length;

        swap(nums, 0, len - 1);
        swap(nums, 0, k - 1);
        swap(nums, k, len - 1);


    }

    public static void swap(int[] nums, int low, int high){
        while (low < high){
            int tmp;
            tmp = nums[low];
            nums[low] = nums[high];
            nums[high] = tmp;
            low++;
            high--;
        }
    }






    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
//        rotate1(nums, 3);
        int[] nums = {1};
        rotate(nums, 0);

        for (int i = 0; i < nums.length; i++) {

            System.out.println(nums[i]);
        }



    }
}
