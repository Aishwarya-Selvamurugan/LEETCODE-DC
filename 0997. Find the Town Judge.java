class Solution {
    public int findJudge(int n, int[][] trust) {
        int l = trust.length;
        int indegree[] = new int[n+1];
        int outdegree[] = new int[n+1];
        for(int i=0;i<l;i++)
        {
            indegree[trust[i][1]]++;
            outdegree[trust[i][0]]++;
        }
        int index = -1;
        int in = 0;
        int ot = 0;
        for(int i=0;i<=n;i++)
        {
            if(indegree[i] == 0 && outdegree[i] == 1)
            {
                continue;
            }
            if(indegree[i] == n-1 && outdegree[i] == 0) 
            {
                index = i;
            }
        }
        return index;
    }
}
