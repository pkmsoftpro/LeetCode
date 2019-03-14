package graph.minhighttrees_310;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
	    if (n == 1) {
	        return Arrays.asList(0);
	    }
	    
	    List<List<Integer>> adj = new ArrayList<>();
	    int[] inlinks = new int[n];
	    createGraph(n, edges, adj, inlinks);
	     
	    List<Integer> leaves = new LinkedList<>();
	    for(int i = 0; i < inlinks.length; i++) {
	        if (inlinks[i] == 1) {
	            leaves.add(i);
	        }
	    }
	    
	    while (n > 2) {
	        List<Integer> newLeaves = new ArrayList<>();
	        for (int leave : leaves) {
	            for (int nb : adj.get(leave)) {
	                inlinks[nb]--;
	                if (inlinks[nb] == 1) {
	                    newLeaves.add(nb);
	                }
	            }
	        }
	        n -= leaves.size();
	        leaves = newLeaves;
	    }
	    
	    return leaves;
	}

	public void createGraph(int n, int[][] edges, List<List<Integer>> adj, int[] inlinks) {
	    for (int i = 0; i < n; i++) {
	        adj.add(new ArrayList<Integer>());
	    }
	    for (int[] e : edges) {
	        adj.get(e[0]).add(e[1]);
	        adj.get(e[1]).add(e[0]);
	        inlinks[e[0]]++;
	        inlinks[e[1]]++;
	    }
	}
	
	public static void main(String args[]) 
	{
		int[][] pr = {{0,3},{1,3},{2,3},{4,3},{5,4}};
		List<Integer> list = new Solution().findMinHeightTrees(6, pr);
		System.out.println(list);
	} 
}
