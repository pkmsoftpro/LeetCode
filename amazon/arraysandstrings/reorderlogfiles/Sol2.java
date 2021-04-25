package arraysandstrings.reorderlogfiles;

import java.util.*;

public class Sol2 {
  public String[] reorderLogFiles(String[] logs) {

    Arrays.sort(
        logs,
        new Comparator<String>() {
          @Override
          public int compare(String o1, String o2) {

            String[] s1 = o1.split(" ", 2);
            String[] s2 = o2.split(" ", 2);

            boolean isDigit1 = Character.isDigit(s1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(s2[1].charAt(0));

            if (!isDigit1 && !isDigit2) {
              if (s1[1].equals(s2[1])) {
                return s1[0].compareTo(s2[0]);
              } else s1[1].compareTo(s2[1]);
            } else if (isDigit1 && !isDigit2) return -1;
            else return 1;
            return 0;
          }
          ;
        });
    return logs;
  }

  public static void main(String[] args) {
    String[] logs = {
      "dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"
    };
    String[] output = new Sol2().reorderLogFiles(logs);
    for (String s : output) {
      System.out.println(s);
    }
  }
}
