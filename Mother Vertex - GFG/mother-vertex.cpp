//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
    void dfs(int vertex,vector<int> adj[],bool visited[]){
        visited[vertex] = true;
        
        for(auto it:adj[vertex]){
            if(!visited[it])
                dfs(it,adj,visited);
        }
    }
    
    public:
int findMotherVertex(int V, vector<int>adj[]){
    int mother_vertex;
        bool visited[V] = {false};
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                mother_vertex = i;
            }
        }
        
        for(int i=0;i<V;i++)
            visited[i] = false;
            
        dfs(mother_vertex,adj,visited);
        
        for(int i=0;i<V;i++)
            if(!visited[i])
                return -1;
                
        return mother_vertex;
}
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int V, E;
		cin >> V >> E;
		vector<int>adj[V];
		for(int i = 0; i < E; i++){
			int u, v;
			cin >> u >> v;
			adj[u].push_back(v);
		}
		Solution obj;
		int ans = obj.findMotherVertex(V, adj);
		cout << ans <<"\n";
	}
	return 0;
}
// } Driver Code Ends