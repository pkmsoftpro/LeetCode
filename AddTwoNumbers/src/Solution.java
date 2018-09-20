import java.util.ArrayList;

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
		
        ListNode dummy = null;
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        if(l1!=null) a1.add(l1.val);
        if(l2!=null) a2.add(l2.val);
        while(l1.next!=null){
        	l1 = l1.next;
        	a1.add(l1.val);
        }
        while(l2.next!=null){
        	l2 = l2.next;
        	a2.add(l2.val);
        }
        int a1size = a1.size();
        int a2size = a2.size();
        int n=1,num1=0,num2=0;
        for(int i=a1size; i>0; i--){
        	int m = (int) (a1.get(a1.size()-n) * Math.pow(10,a1.size()-n));
        	num1 = num1+m;
        	n++;
        }
        n=1;
        for(int i=a2size; i>0; i--){
        	int m = (int) (a2.get(a2.size()-n) * Math.pow(10,a2.size()-n));
        	num2 = num2+m;
        	n++;
        }
        int sum = num1+num2;
        return dummy;
		
    }
}
