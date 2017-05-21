/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
     if(head==NULL)
        return false;
    struct ListNode *slow = head;
    struct ListNode *fast = head->next;
    while(slow!=fast){
        if(fast==NULL)
            return NULL;
        if(slow==NULL)
            return NULL;
        if(slow->next==NULL)
            slow = NULL;
        else
            slow = slow->next;
        if(fast->next==NULL)
            fast = NULL;
        else if(fast->next->next==NULL)
            fast = NULL;
        else
            fast = fast->next->next;
    }
    fast = head;
    slow = slow->next;
    while(slow!=fast){
        slow = slow->next;
        fast = fast->next;
    }
    return slow;
}/* Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Note: Do not modify the linked list.

Follow up:
Can you solve it without using extra space? */
Just make a easier understanding.
Suppose the first meet at step k,the distance between the start node of list and the start node of cycle is s, and the distance between the start node of cycle and the first meeting node is m. Then 2k = (s + m + n1r) = 2(s + m + n2r) ==> s + m = nr. Steps moving from start node to the start of the cycle is just s, moving from m by s steps would be the start of the cycle, covering n cycles. In other words, they meet at the entry of cycle.
