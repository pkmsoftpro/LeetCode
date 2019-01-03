package addnumbers;

public class AddNumber {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a =0, b=0;
        int x =10;
        int i=0,j=0;
        while(l1!=null){
            a=(int) (a+ (l1.val)*Math.pow(10, i));
            l1 = l1.next;
            i++;
        }
        while(l2!=null){
            b=(int) (b+ (l2.val)*Math.pow(10, j));
            l2 = l2.next;
            j++;
        }
        System.out.println(a+b);
        return null;
    }
	
	public static ListNode createListNode(int n){
		int k =n; ListNode ln = null;
		ListNode t = null;
		if(k%10 ==0){
			while(k%10 == 0){
				k = k/10;
				if(k%10 != 0){
					ln = new ListNode(k%10);
					break;
				}
			}
		} else {
			ln = new ListNode(k%10);
		}
		n = n/10;
		int i=0;
		int j=0;
		while(n!=0){
			j = n%10;
			t = ln.next;
			t = new ListNode(j);
			ln.next = t;
			n = n/10;
			i++;
		}
		return ln;
	}
	
	public static ListNode crec(ListNode t, int i){
		i = i/10;
		while(i!=0){
			t.next = new ListNode(i);
			crec(t.next, i);
			return t;
		}
		return null;
	}
	
	public static void main(String[] args) {
		ListNode t = crec(new ListNode(0), 1234);
		createListNode(1234);
		
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);
		
		System.out.println(new AddNumber().addTwoNumbers(l1, l2));
	}
}
