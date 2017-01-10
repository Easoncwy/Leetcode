package longestPalindromicSubstring_5;

/**
 * Created by eason on 2017/1/10.
 */
public class Solution1 {
    public static String longestPalindrome(String s){
        if ((s == null) || (s.length() == 0)){
            return null;
        }
        int len = s.length();
        int max = 0;
        String longestSubString = null;

        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            for (int j = len; j > i; j--) {
                String subString = s.substring(i, j);
                if (isPalindrome(subString)){
                    int subLen = subString.length();
                    if ((subString.length() >= max)){
                        max = subLen;
                        longestSubString = subString;
                    }
                }
            }
        }
        return longestSubString;
    }

    public static boolean isPalindrome(String s){
        boolean flag = true;
        int len = s.length();
        int low = 0;
        int high = len - 1;
        while (low < high){
            if (s.charAt(low) == s.charAt(high)){
                low++;
                high--;
            }else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        String s = "cbaba";
        String longestSubString = longestPalindrome(s);
        System.out.println(longestSubString);
    }

}
