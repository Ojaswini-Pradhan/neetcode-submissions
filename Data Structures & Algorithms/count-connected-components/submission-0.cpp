class Solution {
private:
    void dfs(int node, vector<vector<int>>& adj, int vis[], vector<int>& ls){
        vis[node] = 1;
        ls.push_back(node);
        for(auto it: adj[node]){
            if(!vis[it]){
                dfs(it, adj, vis, ls);
            }
        }
    }    
public:
    int countComponents(int n, vector<vector<int>>& edges) {
        vector<vector<int>> adj(n);
        int vis[n] = {0};
        int start = 0;
        
        for(auto edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj[u].push_back(v);
            adj[v].push_back(u);
        }

        vector<vector<int>> res;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                vector<int> comp;
                dfs(i, adj, vis, comp);
                res.push_back(comp);
            }
        }
        int k = res.size();
        return k;
    }
};
