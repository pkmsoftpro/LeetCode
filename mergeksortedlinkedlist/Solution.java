package mergeksortedlinkedlist;
/*
 * https://leetcode.com/problems/merge-k-sorted-lists/discuss/210903/MergeSort-Algorithm-using-JAVA-beats-81
 * https://leetcode.com/problems/merge-k-sorted-lists/discuss/10528/A-java-solution-based-on-Priority-Queue?page=1
 * 		O(nk * log(k)) which is same as using divide and conquer
 */
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public static ListNode mergeKLists(ListNode[] t) {
    	List<ListNode> lists = Arrays.asList(t);
        if (lists==null||lists.size()==0) return null;
        
        PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(lists.size(),new Comparator<ListNode>(){
            @Override
            public int compare(ListNode o1,ListNode o2){
                if (o1.val<o2.val)
                    return -1;
                else if (o1.val==o2.val)
                    return 0;
                else 
                    return 1;
            }
        });
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        
        for (ListNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
    	int k = 3; // Number of linked lists 
    
        // an array of pointers storing the head ListNodes  
        // of the linked lists  
        ListNode arr[]=new ListNode[k];  
    
        arr[0] = new ListNode(1);  
        arr[0].next = new ListNode(4);  
        arr[0].next.next = new ListNode(7);  
        arr[0].next.next.next = new ListNode(10);  
    
        arr[1] = new ListNode(2);  
        arr[1].next = new ListNode(5);  
        arr[1].next.next = new ListNode(8);  
        arr[1].next.next.next = new ListNode(11);  
    
        arr[2] = new ListNode(3);  
        arr[2].next = new ListNode(6);  
        arr[2].next.next = new ListNode(9);  
        arr[2].next.next.next = new ListNode(12);
        
        ListNode head = mergeKLists(arr);  
        System.out.println(head);
	}
}