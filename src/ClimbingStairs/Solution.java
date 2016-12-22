package ClimbingStairs;

/**
 * Created by eason on 2016/12/2.
 */
public class Solution {
    /**
     * 递归法
     * @param n
     * @return
     */
    public static int climbStairs(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    /**
     * 动态规划法
     * @param n
     * @return
     */
    public static int climbStairs2(int n){
        if (n < 2)
            return 1;
        int[] a = new int[n + 1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; i++){
            a[i] = a[i - 1] + a[i - 2];
        }
        return a[n];
    }

    /**
     * 节约空间法
     * @param n
     * @return
     */
    public static int climbStairs3(int n){
        if (n < 2)
            return 1;
        int a0 = 1;
        int a1 = 1;
        for (int i = 2; i <= n; i++){
            int temp = a1;
            a1 = a1 + a0;
            a0 = temp;
        }
        return a1;
    }


    public static void main(String[] args) {
        System.out.println(climbStairs(3));
        System.out.println(climbStairs2(4));
        System.out.println(climbStairs3(5));

    }
}
