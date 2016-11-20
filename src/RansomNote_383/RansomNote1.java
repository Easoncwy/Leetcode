package RansomNote_383;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eason on 16/11/17.
 */

public class RansomNote1 {
    /**
     * 穷举法
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean canConstruct(String ransomNote, String magazine){

        if (ransomNote.equals(magazine)){
            return true;
        }
        if (ransomNote.equals("")){
            return true;
        }

        List<Character> ransomList = new ArrayList<>();
        List<Character> magList = new ArrayList<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            ransomList.add(ransomNote.charAt(i));
        }

        for (int i = 0; i < magazine.length(); i++) {
            magList.add(magazine.charAt(i));
        }

        boolean flag = false;

        for (int i = 0; i < ransomList.size(); i++) {
            Character ch = ransomList.get(i);
            if (magList.contains(ch)){
                magList.remove(ch);
                if (i == ransomList.size() - 1 && magList.size() >=  0){
                    flag = true;
                }
            }else {
                break;

            }

        }
        return flag;
    }



}
