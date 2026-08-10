/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode cur=dummy;
        int carry=0;

        while(l1!= null || l2!=null || carry!=0){
            int d1= (l1!=null) ? l1.val : 0;
            int d2= (l2!=null) ? l2.val : 0;

            int total= d1+d2+carry;
            int digittorec = total%10;
            carry= total/10;

            cur.next= new ListNode(digittorec);
            cur= cur.next;

            if(l1!=null) l1= l1.next;
            if(l2!=null) l2= l2.next;
        }
        return dummy.next;
    }
}
