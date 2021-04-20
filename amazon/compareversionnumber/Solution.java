package compareversionnumber;

public class Solution {
  public int compareVersion(String version1, String version2) {
    String[] first = version1.split("\\.");
    String[] second = version2.split("\\.");

    int maxLength = Math.max(first.length, second.length);
    int k = Integer.MIN_VALUE;

    for(int i=0; i<maxLength; i++){
      Integer i1=0,i2=0;
      if(first.length>i && !first[i].isEmpty()) i1 = Integer.valueOf(first[i]);
      else i1=0;
      if(second.length>i && !second[i].isEmpty()) i2 = Integer.valueOf(second[i]);
      else i2=0;
      k = i1.compareTo(i2);
      if(k!=Integer.MIN_VALUE && k!=0) return k;

    }
    return 0;
  }

  public static void main(String[] args) {
    String version1 = "7.5.3", version2 = "7.5.2.4";
    String version3 = "1.0", version4 = "1.0.0";
    String version5 = "1.01", version6 = "1.001";
    System.out.println(new Solution().compareVersion(version5, version6));
  }
}
