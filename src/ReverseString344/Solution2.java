package ReverseString344;

/**
 * Created by supreme on 16/8/6.
 */
//交换数组的首尾字符,两个指针
public class Solution2 {
    public static String reverseString(String s){
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        char temp;
        while (i < j){
            temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }
    public static void main(String[] args){

        System.out.println(reverseString("hello"));
    }
}
