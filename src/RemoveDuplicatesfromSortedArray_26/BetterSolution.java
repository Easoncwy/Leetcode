package RemoveDuplicatesfromSortedArray_26;

/**
 * Created by eason on 16/12/1.
 */
public class BetterSolution {
    public static int removeDuplicates(int[] nums){
        int i = 1;
        int j = 0;
        for (; i < nums.length; i++){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args){
        int[] nums = {1,1,2};
        int count = removeDuplicates(nums);
        System.out.println(count);
        System.out.println("**********************");
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

    }

}
