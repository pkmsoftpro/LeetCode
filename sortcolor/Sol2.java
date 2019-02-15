package sortcolor;

class Sol2 {
    public void sortColors(int[] nums) {
		int[] colors = new int[3];
		for(int num : nums) {
			colors[num] ++;
		}
		int i=0;
		for(int a =0;a<3;a++) {
			for(int b=1;b<=colors[a];b++) {
				nums[i++] = a;
			}
		}
	}
    

    
    public static void main(String[] args) {
		int[] nums = {1,0,2,1,1,0};
		new Sol2().sortColors(nums);
		System.out.println("done");
	}
}
