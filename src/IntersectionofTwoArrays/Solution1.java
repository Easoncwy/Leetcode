package IntersectionofTwoArrays;

import java.util.*;

/**
 * Created by supreme on 16/8/4.
 */

//用两个hash table
//回去看看Java编程思想里的Hash Table的用法
public class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }


        for (int i = 0; i < nums2.length; i++) {
            if (set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] newArray = new int[set2.size()];
        int i = 0;
        for (int e: set2) {
            newArray[i++] = e;
        }

        return newArray;
    }

    public static void main(String[] args){

    }
}
