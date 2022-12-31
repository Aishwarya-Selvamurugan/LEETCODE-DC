class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] g = new int[n];
        List<Integer>[] set = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            set[i] = new ArrayList<>();
        }
        for(int i=0;i<dislikes.length;i++)
        {
            set[dislikes[i][0]-1].add(dislikes[i][1]-1);
            set[dislikes[i][1]-1].add(dislikes[i][0]-1);
        }
        for(int j=0;j<n;j++){
            if(g[j] == 0){
        Queue<Integer> q = new LinkedList<>();
        q.add(j);
        g[j] = 1;
        while(!q.isEmpty())
        {
            int a = q.remove();
            for(int i=0;i<set[a].size();i++)
            {
                if(g[set[a].get(i)] == 0)
                {
                    g[set[a].get(i)] = g[a]*-1;
                    q.add(set[a].get(i));
                }
                else if(g[set[a].get(i)] == g[a])
                {
                    return false;
                }
                
            }

        }
        }
        }
        return true;
    }
}
