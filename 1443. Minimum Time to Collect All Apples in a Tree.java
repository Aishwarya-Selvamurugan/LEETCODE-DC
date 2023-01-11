class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<Integer>[] g = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            g[i] = new ArrayList<>();
        }
        for(int i=0;i<edges.length;i++)
        {
            g[edges[i][0]].add(edges[i][1]);
            g[edges[i][1]].add(edges[i][0]);
        }
        boolean[] v = new boolean[n];
        return min(0,g,hasApple,v);
    }
    public int min(int k,List<Integer>[] g,List<Boolean> a,boolean[] v)
    {
        if(v[k])
        {
            return 0;
        }
        v[k] = true;
        int sum = 0;
        for(int e:g[k])
        {
            sum += min(e,g,a,v);
        }
        if(k==0)
        {
            return sum;
        }
        if(sum > 0 || a.get(k))
        {
            return sum+2;
        }
        return 0;
    }
}
