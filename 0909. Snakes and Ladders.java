class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int seen[] = new int[n*n+1];
        seen[1] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        int steps = 0;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int curr = q.poll();
                if(curr == n*n)
                {
                    return steps;
                }
                int min = Math.min(curr+6,n*n);
                for(int j = curr+1;j<=min;j++)
                {
                    
                    int r = n-1-(j-1)/n;
                    int c = (j-1)%n;
                    if(r%2==n%2)
                    {
                        c = n-1-c;
                    }
                
                int dest = board[r][c] == -1 ? j:board[r][c];
                if(seen[dest] != 1)
                {
                    seen[dest] = 1;
                    q.add(dest);
                }
                }
            }
            steps++;
        }
        return -1;
    }
}
