package NimGame;

import java.util.Scanner;

/**
 * Created by supreme on 16/3/7.
 */
public class Solution {
    public static boolean canWinNim(int n){
        if (n >0 && n <3)
            return true;
        if (n % 4 == 0)
            return false;
        else
            return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (canWinNim(n))
            System.out.println("win");
        else
            System.out.println("lose");

    }
}