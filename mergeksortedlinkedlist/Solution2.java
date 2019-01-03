package mergeksortedlinkedlist;


public class Solution2{

	public static ListNode mergeKLists(ListNode[] lists) {
		return mergeNodes(lists, 0, lists.length-1);
	}
	
	public static ListNode mergeNodes(ListNode[] lists, int start, int end){
		if(start==end){
			return lists[start];
		}
		if(start<end){
			int mid = start + (end-start)/2;
			ListNode left = mergeNodes(lists, start, mid);
			ListNode right = mergeNodes(lists, mid+1, end);
			return merge(left, right);
		}
		return null;
	}
	
	public static ListNode merge(ListNode l1, ListNode l2){
		
		while(l1!=null && l2!=null){
			if (l1.val < l2.val) {
				l1.next = merge(l1.next, l2);
				return l1;
			} else {
				l2.next = merge(l1, l2.next);
				return l2;
			}
		}
		
		return l1==null?l2:l1;
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
