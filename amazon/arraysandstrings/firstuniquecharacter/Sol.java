package arraysandstrings.firstuniquecharacter;

public class Sol {
    public static void main(String[] args) {
        String s = "loveleetcode", s1 = "aabb";
        System.out.println(new Sol().firstUniqChar(s));
    }

    public int firstUniqChar(String s) {
        int[] count = new int[26];
        int n = s.length();
        // build char count bucket : <charIndex, count>
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        // find the index
        for (int i = 0; i < n; i++) {
            int index = s.charAt(i) - 'a';
            if (count[index] == 1) {
                return i;
            }

        }
        return -1;
    }
}
