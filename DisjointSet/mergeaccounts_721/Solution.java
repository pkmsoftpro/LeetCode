/*
** https://leetcode.com/problems/accounts-merge/discuss/109157/JavaC%2B%2B-Union-Find
/*


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Solution {
  public static void main(String[] args) {
    List<List<String>> accounts = new ArrayList<List<String>>();
    String[][] strs1 =
        {{"John", "johnsmith@mail.com", "john00@mail.com"}, {"John", "johnnybravo@mail.com"},
            {"John", "johnsmith@mail.com", "john_newyork@mail.com"}, {"Mary", "mary@mail.com"}};
    String[][] strs2 = 
      {   {"John","johnsmith@mail.com","john_newyork@mail.com"},
          {"John","johnsmith@mail.com","john00@mail.com"},
          {"Mary","mary@mail.com"},
          {"John","johnnybravo@mail.com"}};
    String[][] strs = 
      {{"David","David0@m.co","David1@m.co"},
          {"David","David3@m.co","David4@m.co"},
          {"David","David4@m.co","David5@m.co"},
          {"David","David2@m.co","David3@m.co"},
          {"David","David1@m.co","David2@m.co"}};
    for(String[] arr : strs) accounts.add(Arrays.asList(arr));
    System.out.println(new Solution().accountsMerge(accounts));
  }

  public List<List<String>> accountsMerge(List<List<String>> acts) {
    Map<String, String> owner = new HashMap<>();
    Map<String, String> parents = new HashMap<>();
    Map<String, TreeSet<String>> unions = new HashMap<>();
    for (List<String> a : acts) {
      for (int i = 1; i < a.size(); i++) {
        parents.put(a.get(i), a.get(i));
        owner.put(a.get(i), a.get(0));
      }
    }
    for (List<String> a : acts) {
      String p = find(a.get(1), parents);
      for (int i = 2; i < a.size(); i++)
        parents.put(find(a.get(i), parents), p);
    }
    for (List<String> a : acts) {
      String p = find(a.get(1), parents);
      if (!unions.containsKey(p))
        unions.put(p, new TreeSet<>());
      for (int i = 1; i < a.size(); i++)
        unions.get(p).add(a.get(i));
    }
    List<List<String>> res = new ArrayList<>();
    for (String p : unions.keySet()) {
      List<String> emails = new ArrayList(unions.get(p));
      emails.add(0, owner.get(p));
      res.add(emails);
    }
    return res;
  }

  private String find(String s, Map<String, String> p) {
    return p.get(s) == s ? s : find(p.get(s), p);
  }
}
