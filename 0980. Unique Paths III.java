class Solution {
    int res = 0;
    int r,c;
    public int uniquePathsIII(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        int count = 0,startI=0,startJ=0,endI=0,endJ=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j] == 0)
                {
                    count++;
                }
                else if(grid[i][j] == 1)
                {
                    startI = i;
                    startJ = j;
                }
                else if(grid[i][j] == 2)
                {
                    endI = i;
                    endJ = j;
                }
            }
        }
        dfs(grid,startI,startJ,endI,endJ,count);
        return res;
    }
    public void dfs(int grid[][],int startI,int startJ,int endI,int endJ,int count)
    {
        if(!(startI>=0 && startI<r && startJ>=0 && startJ<c))
        {
            return;
        }
        if(grid[startI][startJ] == -1)
        {
            return;
        }
        if(grid[startI][startJ] == 2)
        {
            if(count == -1)
            {
                res++;
            }
            return;
        }
        count--;
        grid[startI][startJ] = -1;
        dfs(grid,startI-1,startJ,endI,endJ,count);
        dfs(grid,startI+1,startJ,endI,endJ,count);
        dfs(grid,startI,startJ+1,endI,endJ,count);
        dfs(grid,startI,startJ-1,endI,endJ,count);
        grid[startI][startJ] = 0;
    }
}
