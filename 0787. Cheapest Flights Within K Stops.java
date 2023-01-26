class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<int[]>[] g = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            g[i] = new ArrayList<>();
        }
        for(int i=0;i<flights.length;i++)
        {
            g[flights[i][0]].add(new int[]{flights[i][1],flights[i][2]});
        }
        Queue<int[]> q = new LinkedList<>();
        int min[] = new int[n];
        Arrays.fill(min,Integer.MAX_VALUE);
        q.add(new int[]{src,0});
        while(!q.isEmpty() && k>=0)
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int b = q.peek()[1];
                int a = q.poll()[0];
                for(int j=0;j<g[a].size();j++)
                {
                    if(min[g[a].get(j)[0]] <= b+(g[a].get(j)[1]))
                    {
                        continue;
                    }
                    min[g[a].get(j)[0]] = Math.min(b+(g[a].get(j)[1]),min[g[a].get(j)[0]]);
                    q.add(new int[]{g[a].get(j)[0],min[g[a].get(j)[0]]});
                }
            }
            k--;
        }
        return min[dst] == Integer.MAX_VALUE?-1:min[dst];
    }
}
