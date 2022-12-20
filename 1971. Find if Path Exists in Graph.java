class Solution {
    boolean seen;
    boolean visited[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        HashSet<Integer>[] g = new HashSet[n];
        visited = new boolean[n];
        for(int i=0;i<n;i++)
        {
            g[i] = new HashSet<>();
        }

        int l = edges.length;
        for(int i=0;i<l;i++)
        {
            g[edges[i][0]].add(edges[i][1]);
            g[edges[i][1]].add(edges[i][0]);
        }

        if(g[source].contains(destination))
        {
            return true;
        }

        seen = false;
        DFS(g,source,destination);
        return seen;
    }
    public void DFS(HashSet<Integer>[] g,int start,int end)
    {
        if(!visited[start] && !seen)
        {
            if(start == end)
            {
                seen = true;
                return;
            }

            visited[start] = true;
            for(Integer neighbour:g[start])
            {
                DFS(g,neighbour,end);
            }
        }
    }
}
