class Pair{
    int v;
    int parent;
    
    Pair(int v, int parent){
        this.v = v;
        this.parent = parent;
    }
}

class Solution {
    public boolean isCycle(int V, int[][] edges) {
        
        int[] vis = new int[V];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for( int i = 0; i < V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        // BFS 
        
        Queue<Pair> q = new ArrayDeque<>();
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                q.offer(new Pair(i, -1));
                vis[i] = 1;
                
                while(!q.isEmpty()){
                    Pair curr = q.poll();
                    
                    for(int ver : adj.get(curr.v)){
                        if(vis[ver] == 0){
                            vis[ver] = 1;
                            q.offer(new Pair(ver, curr.v));
                        }
                        else if(curr.parent != ver){
                            return true;
                        }
                    }
                }
            }
            
        }
        
        return false;
    }
}
