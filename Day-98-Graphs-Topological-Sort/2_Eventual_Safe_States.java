class Solution {
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        
        int[] outdegree = new int[n];
        
        for(int i = 0; i < n; i++) {
            outdegree[i] = graph[i].length;
            
            for(int a : graph[i]) {
                adj.get(a).add(i);
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
            if(outdegree[i] == 0) {
                q.offer(i);
            }
        }
        
        boolean[] safe = new boolean[n];
        
        while(!q.isEmpty()) {
            
            int curr = q.poll();
            safe[curr] = true;
            
            for(int prev : adj.get(curr)) {
                outdegree[prev]--;
                
                if(outdegree[prev] == 0) {
                    q.offer(prev);
                }
            }
        }
        
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            if(safe[i]) {
                ans.add(i);
            }
        }
        
        return ans;
    }
}
