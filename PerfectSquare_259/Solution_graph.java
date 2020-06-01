//https://www.youtube.com/watch?v=sJVx17AyIc0
//https://stackoverflow.com/questions/55685702/bfs-solution-to-find-least-perfect-squares
class Solution {
    public int numSquares(int n) {
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        int level = 0;
        int remain = 0;
        boolean[] visited = new boolean[n];
        while(!q.isEmpty()) {
          level = level + 1;
          int size = q.size();
          for(int i=1; i<=size; i++) {
            int num = q.poll();
            for(int j=1; j*j<=num; j++) {
              remain = num - j*j;
              if(remain ==0) 
                return level;
              else if(remain>0 && !visited[remain-1]) {
                visited[remain-1] = true;
                q.offer(remain);
              } else if(remain < 0)
                break;
            }
          }
        }
        return level;
    }
}
