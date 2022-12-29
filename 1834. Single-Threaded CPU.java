class Solution {
    public int[] getOrder(int[][] tasks) {
        int l = tasks.length;
        PriorityQueue<int[]> p = new PriorityQueue<>((a,b)->(a[1]==b[1]?a[2]-b[2]:a[1]-b[1]));
        int arr[][] = new int[l][3];
        for(int i=0;i<l;i++)
        {
            arr[i][0] = tasks[i][0];
            arr[i][1] = tasks[i][1];
            arr[i][2] = i;
        }
        Arrays.sort(arr,(a,b)->(a[0]-b[0]));
        int res[] = new int[l];
        int currtime = 0;
        int index = 0;
        int k = 0;
        int i = 0;
        while(k<l || !p.isEmpty())
        {
            if(k<l && currtime < arr[k][0] && p.isEmpty())
            {
                currtime = arr[k][0];
            }
            while(k<l && arr[k][0] <= currtime)
            {
                p.add(arr[k]);
                k++;
            }
            
            int processtime = p.peek()[1];
            currtime += processtime;
            res[i++] = p.peek()[2];
            p.remove();
        }
        return res;
    }
}
