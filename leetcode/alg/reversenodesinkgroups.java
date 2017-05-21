/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        if(len==1)
            return head;
        int q = len/k;
        int tot = q*k;
        q = tot/k;
        int cpy = q;
        ListNode prev = null;
        ListNode st = null;
        ListNode prevhead = null;
        while(q>0){
            ListNode curr = null;
            if(q==cpy)
                curr=head;
            else
                curr = st;
            for(int i=0;i<k;i++){
                ListNode nextone = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextone;
            }  
            if(q==cpy){
                head = prev;
                prevhead = prev;
            }
            st = prev;
            temp = st;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = curr;
            if(q!=cpy){
                temp = prevhead;
                for(int i=0;i<k-1;i++)
                    temp = temp.next;
                temp.next = st;
                prevhead = st;
            }
            prev = null;
            st = curr;
           
            q--;
        }
        return head;
    }
}
