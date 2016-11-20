package RansomNote_383;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eason on 16/11/18.
 */
public class RansomNote2 {
    /**
     *
     * 判断两个字符串中每个字母出现的次数
     * @param ransomNote
     * @param magazine
     * @return
     */
    public static boolean canConstruct(String ransomNote, String magazine){
        char[] ransomArray = ransomNote.toCharArray();
        char[] magArray = magazine.toCharArray();

        int[] arr = new int[26];
        for (char c: magArray) {
            arr[c - 'a']++;
        }

        for (char c: ransomArray) {
            if ((--arr[c - 'a']) < 0){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        if (canConstruct("a", "b")){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }


}
