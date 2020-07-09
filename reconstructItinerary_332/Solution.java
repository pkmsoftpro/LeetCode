/*
  https://leetcode.com/problems/reconstruct-itinerary/discuss/78768/Short-Ruby-Python-Java-C++/83576
  
  Also it should help to see how targets is updating at each step, e.g.,

targets = {'JFK': ['D', 'A'], 'A': ['C'], 'B': ['C'], 'C': ['JFK', 'D'], 'D': ['B', 'A']}
route = []
stack = ['JFK']
First point at which we get stuck:

targets = {'JFK': ['D'], 'A': [], 'B': ['C'], 'C': ['JFK', 'D'], 'D': ['B']}
route = []
stack = ['JFK', 'A', 'C', 'D', 'A']
Update route:

targets = {'JFK': ['D'], 'A': [], 'B': ['C'], 'C': ['JFK'], 'D': ['B']}
route = ['A']
stack = ['JFK', 'A', 'C', 'D']
Search forward again until stuck:

targets = {'JFK': [], 'A': [], 'B': [], 'C': [], 'D': []}
route = ['A']
stack = ['JFK', 'A', 'C', 'D', 'B', 'C', 'JFK', 'D']
Update route:

targets = {'JFK': ['D'], 'A': [], 'B': [], 'C': ['JFK'], 'D': []}
route = ['A', 'D', 'JFK', 'C', 'B', 'D', 'C', 'A', 'JFK']
stack = []
Return route in reverse or do route.add(0,s):

route = ['JFK', 'A', 'C', 'D', 'B', 'C', 'JFK', 'D', 'A']

 public List<String> findItinerary(List<List<String>> tickets) {
    for (List<String> ticket : tickets)
      targets.computeIfAbsent(ticket.get(0), k -> new PriorityQueue()).add(ticket.get(1));
    visit("JFK");
    return route;
  }

  void visit(String airport) {
    while (targets.containsKey(airport) && !targets.get(airport).isEmpty())
      visit(targets.get(airport).poll());
    route.add(0, airport);
  }
*/

package reconstructItinerary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
  public static void main(String[] args) {
    List<List<String>> tickets = new ArrayList<List<String>>();
    // tickets.add(Arrays.asList("JFK", "SFO"));
    // tickets.add(Arrays.asList("JFK", "ATL"));
    // tickets.add(Arrays.asList("SFO", "ATL"));
    // tickets.add(Arrays.asList("ATL", "JFK"));
    // tickets.add(Arrays.asList("ATL", "SFO"));

    // [["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]
    tickets.add(Arrays.asList("JFK", "KUL"));
    tickets.add(Arrays.asList("JFK", "NRT"));
    tickets.add(Arrays.asList("NRT", "JFK"));
    System.out.println(new Solution().findItinerary(tickets));
  }

  public List<String> findItinerary(List<List<String>> tickets) {
    List<String> ret = new ArrayList<String>();
    Map<String, Queue<String>> map = new HashMap<String, Queue<String>>();
    for (List<String> list : tickets) {
      if (map.containsKey(list.get(0))) {
        Queue<String> temp = map.get(list.get(0));
        temp.add(list.get(1));
      } else {
        Queue<String> q = new PriorityQueue<String>(new Comparator<String>() {
          public int compare(String o1, String o2) {
            return o1.compareTo(o2);
          }
        });
        q.add(list.get(1));
        map.put(list.get(0), q);
      }
    }
    visit(map, "JFK", ret);
    return ret;
  }

  public void visit(Map<String, Queue<String>> map, String key, List<String> list) {
    while (map.containsKey(key) && !map.get(key).isEmpty()) 
      visit(map, map.get(key).poll(), list);
    list.add(0, key);
  }
}
