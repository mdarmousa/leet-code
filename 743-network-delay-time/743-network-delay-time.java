class Solution {
public int networkDelayTime(int[][] times, int n, int k) {
        int res = -1;
        
        //create adjacency list
        ArrayList<int[]>[] graph = new ArrayList[n + 1]; // n+1 because node value starts from 1 & not 0
        for(int i = 0; i <= n; i++) graph[i] = new ArrayList<>();
        for(int i = 0; i < times.length; i++) {
            graph[times[i][0]].add(new int[]{times[i][1], times[i][2]});
        }
        
        boolean[] visited = new boolean[n + 1];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        queue.offer(new int[]{k, 0}); //int[0] for node value & int[1] for edge weight or time in this case
        
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            if(visited[curr[0]]) continue;
            visited[curr[0]] = true;
            res = curr[1];
            n--;
            for(int[] e : graph[curr[0]]) {
                if(!visited[e[0]]) queue.offer(new int[]{e[0], e[1] + curr[1]});
            }
        }
        
        return n == 0 ? res : -1;
    }
}