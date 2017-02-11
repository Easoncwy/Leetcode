package TwoSunII_167;

/**
 * Created by eason on 16/11/18.
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target){
        int[] index = new int[2];
        int low = 0,high = numbers.length - 1;
        while (low < high){
            int sum = numbers[low] + numbers[high];
            if (sum == target){
                index[0] = low + 1;
                index[1] = high + 1;
                break;
            }else if (sum > target){
                high--;
            }else {
                low++;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 5, 6};
        int target = 9;
        int[] index = twoSum(numbers, target);
        for (int i:index) {
            System.out.print(i);
        }

    }


}
