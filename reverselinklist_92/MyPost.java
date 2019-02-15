

/*


for(int i=0; i<n-m; i++)
{
    start.next = then.next;
    then.next = pre.next;
    pre.next = then;
    then = start.next;
}

/*
*Legends:
*  ListNode dummy = new ListNode(0); // create a dummy node to mark the head of this list
dummy.next = head;
ListNode pre = dummy;
*   ListNode start = pre.next; // a pointer to the beginning of a sub-list that will be reversed
ListNode then = start.next; // a pointer to a node that will be reversed


just remeber the sequence:        start -> then then  -> pre pre  -> then then  ->start


*/