/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    //int arr[] = new int[100000];
    if(head==null)
        return false;
    if(head.next==head)
        return true;
    Node slow = head;
    Node fast = head;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
            return true;
    }
    return false;
}
