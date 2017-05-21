/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool hasCycle(struct ListNode *head) {
    if(head==NULL)
        return false;
    struct ListNode *slow = head;
    struct ListNode *fast = head->next;
    while(slow!=fast){
        if(fast==NULL)
            return false;
        if(slow==NULL)
            return false;
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
    return true;
}
/*iven a linked list, determine if it has a cycle in it.

Follow up:
Can you solve it without using extra space?

Subscribe to see which companies asked this question.
*/
