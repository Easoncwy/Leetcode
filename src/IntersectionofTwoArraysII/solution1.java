package IntersectionofTwoArraysII;

import java.util.*;

/**
 * Created by supreme on 16/8/7.
 */
//用一个hash map来存放数组nums1的键值.
//再用ArrayList来存放结果数组
public class solution1 {
    public static int[] intersect(int[] nums1, int[] nums2){

        Map<Integer,Integer> map1 = new HashMap<>();

        ArrayList<Integer> resArray = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])){
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            }
            else
                map1.put(nums1[i], 1);
        }

        for (int j = 0; j < nums2.length; j++){
            if (map1.containsKey(nums2[j]) &&  map1.get(nums2[j]) > 0){
                resArray.add(nums2[j]);
                map1.put(nums2[j],map1.get(nums2[j]) - 1);
            }
        }

        int[] res = new int[resArray.size()];
        for (int i = 0; i < resArray.size(); i++) {
            res[i] = resArray.get(i);
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {1,1,2,2,3,3};
        int[] nums2 = {2,3,2,3};
        int[] res = intersect(nums1,nums2);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

    }
}
