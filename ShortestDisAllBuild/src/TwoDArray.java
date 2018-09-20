
public class TwoDArray {

	public static void main(String[] args) {
		int[][] x = new int[3][4];
		int count = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				x[i][j] = count++;
			}
		}
		
		
		System.out.println(x[0][0]);
		System.out.println(x[0].length);
	}
	
	
}
