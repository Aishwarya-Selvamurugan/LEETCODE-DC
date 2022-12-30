class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        dfs(graph,0,l);
        return res;
    }
    public void dfs(int[][] g,int n,List<Integer> l)
    {
        if(n == g.length-1)
        {
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<g[n].length;i++)
        {
                l.add(g[n][i]);
                dfs(g,g[n][i],l);
                l.remove(Integer.valueOf(g[n][i]));
        }
    }

}
