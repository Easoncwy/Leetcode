package ReverseString344;

/**
 * Created by supreme on 16/8/6.
 */
public class Solution {
    public static String reverseString(String s){
        if (s.length() <= 1 || s == null)
            return s;
        char[] array = s.toCharArray();
        char[] reverseArray = new char[s.length()];

        for (int j = s.length() - 1; j >= 0 ; j--) {
            reverseArray[s.length() - 1 - j] = array[j];

        }

        return new String(reverseArray);
    }
    public static void main(String[] args){
        String s = "hello";
        String reverseString  = reverseString(s);

        System.out.println(reverseString);


    }
}
