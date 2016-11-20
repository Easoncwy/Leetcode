package ReverseString344;

/**
 * Created by supreme on 16/8/6.
 */

//使用StringBuilder
public class Solution1 {
    public static String reverseString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
