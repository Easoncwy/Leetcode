package ExcelSheetColumnNumber;

import java.util.Scanner;

/**
 * Created by supreme on 16/4/23.
 */

public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s){
        if (s == null || s.length() == 0)
            return 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum * 26 + s.charAt(i) - 'A' + 1;
        }
        return sum;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String st = scanner.nextLine();
        System.out.println(titleToNumber(st));

    }
}