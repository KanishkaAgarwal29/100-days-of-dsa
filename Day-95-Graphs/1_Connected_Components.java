class Solution {
    
    public void dfs(ArrayList<Integer> li, ArrayList<ArrayList<Integer>> adj, int[] vis, int ver){
        vis[ver] = 1;
        li.add(ver);
        
        for(int a : adj.get(ver)){
            if(vis[a] == 0){
                dfs(li, adj, vis, a);
            }
        }
    }
    
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int[] vis = new int[V];
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                ArrayList<Integer> li = new ArrayList<>();
                dfs(li, adj, vis, i);
                
                ans.add(li);
            }
        }
        
        return ans;
    }
}
