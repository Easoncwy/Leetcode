package IntersectionOfTwoLinkedList_160;

import java.util.List;

/**
 * Created by eason on 2017/2/19.
 */

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lenA = length(headA),lenB = length(headB);
        while (lenA > lenB){
            --lenA;
            headA = headA.next;
        }

        while (lenA < lenB){
            --lenB;
            headB = headB.next;
        }

        while (headA != headB){
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }

    private int length(ListNode head){
        int len = 0;
        while (head != null){
            ++len;
            head = head.next;
        }
        return len;
    }








}
