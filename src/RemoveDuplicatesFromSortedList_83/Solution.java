package RemoveDuplicatesFromSortedList_83;

/**
 * Created by eason on 2017/2/19.
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

public class Solution {
    public ListNode deleteDeplicates(ListNode head){
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        while (temp != null){
            if (temp.next == null)
                break;

            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            else {
                temp = temp.next;
            }
        }
        return head;
    }

}
