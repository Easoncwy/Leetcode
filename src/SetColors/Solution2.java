package SetColors;

/**
 * Created by supreme on 16/8/12.
 */
public class Solution2 {
    public static void sortColors(int[] nums){

        int count0 = 0;
        int count1 = 1;
        int count2 = 2;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count0++;
            if (nums[i] == 1)
                count1++;
            if (nums[i] == 2)
                count2++;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < count0)
                nums[i] = 0;
            else if (i < count0 + count1)
                nums[i] = 1;
            else
                nums[i] = 2;
        }

    }
    public static void main(String[] args){
        int[] nums = {1,1,0,0,2,2,2};
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();
        int[] nums2 = {0};
        sortColors(nums2);
        for (int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
        System.out.println();
        int[] nums3 = {2};
        sortColors(nums3);
        for (int i = 0; i < nums3.length; i++) {
            System.out.println(nums3[i]);
        }

    }

}
