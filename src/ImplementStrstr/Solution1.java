package ImplementStrstr;

/**
 * Created by eason on 2016/12/6.
 */

public class Solution1 {
    /**
     * 最简单的暴力方法
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle){
        if ((haystack == null) || (haystack.length() < needle.length()))
            return -1;
        if (haystack.equals(needle))
            return 0;
        int M = needle.length();
        int N = haystack.length();
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++){
                if ( haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
            if (j == M)
                return i;
        }
        return -1;
    }


    /**
     * 改进后的暴力算法(显式回退)
     *
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr2(String haystack, String needle){
        if ((haystack == null) || (haystack.length() < needle.length()))
            return -1;
        if (haystack.equals(needle))
            return 0;
        int i;
        int j;
        int M = needle.length();
        int N = haystack.length();
        for (i = 0, j = 0; i < N && j < M; i++){
            if (haystack.charAt(i) == needle.charAt(j)){
                j++;
            }else {
                i -= j;
                j = 0;
            }
        }
        if (j == M)
            return i - M;
        else
            return -1;
    }



    public static void main(String[] args) {

    }


}
