package trappingrainwater_i;
/*
0 2 3
3 4 5
 */
public class Solution2 {
  public int trap(int[] h) {
    int totWater = 0;
    for(int i=0; i<h.length; ){
      int[] decInc = decIncSeq(i, h);

      if(decInc!=null){
        System.out.println(decInc[0] + " " + decInc[1] + " "+ decInc[2]);
        if(h[decInc[0]]<=h[decInc[2]]){       //increasing
          for(int m=decInc[0]+1; m<=decInc[1]; m++){
            totWater += Math.abs(h[decInc[0]]-h[m]);
          }
          for(int m=decInc[1]+1; m<decInc[2]; m++){
            if(h[m]<h[decInc[0]] && h[decInc[0]]<h[decInc[2]]){
              totWater += h[decInc[0]]-h[m];
            }
          }
        } else {                       //decreasing
          for(int m=decInc[2]-1; m>=decInc[1]; m--){
            totWater += Math.abs(h[decInc[2]]-h[m]);
          }
          for(int m=decInc[1]-1; m>decInc[0]; m--){
            if(h[m]<h[decInc[2]] && h[decInc[2]]<=h[decInc[0]]){
              totWater += h[decInc[0]]-h[m];
            }
          }
        }
        i= decInc[2];
      }
      else i++;
    }

    return totWater;
  }

  public int[] decIncSeq(int i, int[] h){
    int size = h.length;
    int j = i;
    if(j+1<size && h[j]>h[j+1]){
      while(j+1<size && h[j]>h[j+1]) j++;

      //look for increasing
      int k = j;
      if(k+1<size && h[k]<=h[k+1]){
        while(k+1<size && h[k]<=h[k+1]) k++;
        return new int[]{i, j, k};
      }
    }
    return null;
  }

  public static void main(String[] args) {
    int[] height = {4,2,0,3,2,5};
    int[] height2 = {0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(new Solution().trap(height));
  }
}
