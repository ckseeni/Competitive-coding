/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode head = res;
        int c = 0;
        while(l1!=null||l2!=null||c!=0){
            int s = 0;
            if(l1!=null)
                s = s + l1.val;
            if(l2!=null)
                s = s + l2.val;
            s = s + c;
            c = s/10;
            int r = s%10;
            ListNode l = new ListNode(r);
            res.next = l;
            res = res.next;
            if(l1!=null)
                l1 = l1.next;
            if(l2!=null)
                l2 = l2.next;
        }
        return head.next;
    }
}
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8s
