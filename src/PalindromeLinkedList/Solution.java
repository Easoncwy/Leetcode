package PalindromeLinkedList;


import java.util.List;

/**
 * Created by eason on 2017/2/18.
 */


class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class Solution {
    public boolean isPalindrome(ListNode head){
        boolean isPalindrome = true;
        if (head == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //odd number
        if (fast !=null){
            slow = slow.next;
        }
        slow = reverse(slow);

        fast = head;


        while (slow != null){
            if (fast.val != slow.val){
                isPalindrome = false;
                break;
            }else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return isPalindrome;
    }
    public ListNode reverse(ListNode head){
        ListNode pre = null;
        while (head != null){
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}

