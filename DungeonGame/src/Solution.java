import java.util.ArrayList;
import java.util.List;

class Holder {
	int a , b;
	Holder(int a, int b){ this.a = a; this.b = b;}
	public String toString() {return a + " " + b;}
}

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
    	
    	int[][] temp = new int[dungeon.length][dungeon[0].length];
    	for(int i=0;i<dungeon.length;i++){
        	for(int j=0;j<dungeon[0].length;j++){
        		temp[i][j] = dungeon[i][j];
        	}
    	}
        for(int i=0;i<dungeon.length;i++){
        	for(int j=0;j<dungeon[0].length;j++){
        		int a = Integer.MIN_VALUE; int b = Integer.MIN_VALUE;
        		if(i-1>-1) a = dungeon[i-1][j];
        		if(j-1>-1) b = dungeon[i][j-1];
        		if(a==Integer.MIN_VALUE) {
        			if(b==Integer.MIN_VALUE) b=0;
        			dungeon[i][j]+=b;
        		}
        		else if(b==Integer.MIN_VALUE) {
        			if(a==Integer.MIN_VALUE) a=0;
        			dungeon[i][j]+=a;
        		}
        		else dungeon[i][j] = Math.abs(dungeon[i][j] + a) < 
								 Math.abs(dungeon[i][j] + b) ? 
										 dungeon[i][j] + a
										 : dungeon[i][j] + b;
        	}
        }
        int row = dungeon.length-1;
        int col = dungeon[0].length-1;
        List<Holder> list = new ArrayList<Holder>();
        list.add(new Holder(row,col));
        while(!(row==0 && col==0)){
        	int x=Integer.MIN_VALUE,y=Integer.MIN_VALUE;
        	if(row-1>-1) x= dungeon[row-1][col];
        	if(col-1>-1) y=dungeon[row][col-1];
        	if(x==Integer.MIN_VALUE) {
    			if(y==Integer.MIN_VALUE) y=0;
    			list.add(new Holder(row,col-1));
    			col = col-1;
    		}
    		else if(y==Integer.MIN_VALUE) {
    			if(x==Integer.MIN_VALUE) x=0;
    			list.add(new Holder(row-1,col));
    			row = row-1;
    		}
    		else if(Math.abs(dungeon[row][col]+x)<Math.abs(dungeon[row][col] + y)){
        		list.add(new Holder(row-1,col));
        		row = row-1;
        	} else {
        		list.add(new Holder(row,col-1));
        		col = col-1;
        	}
        	
        }
        int sum =0;
        for(Holder h : list){
        	sum += temp[h.a][h.b];
        	sum = sum<0?sum:0;
        }
       /* int retVal = dungeon[dungeon.length-1][dungeon[0].length-1];
        return retVal<1 ? -(retVal)+1 : 1;*/
        return sum<0?-(sum)+1:1;
    }
    
    public static void main(String[] args) {
    	Solution sol = new Solution();
		//int[][] arr = {{-2,-3,3},{-5,-10,1},{10,30,-5}};
    	//int[][] arr = {{-3,5}};
    	int[][] arr = {{0,5},{-2,-3}};
		System.out.println(sol.calculateMinimumHP(arr));
	}
}