class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l = new ArrayList<>();
        for(int[] a:intervals)
        {
            l.add(a);
        }
        l.add(newInterval);
        Collections.sort(l,(a,b)->(a[0]==b[0]?a[1]-b[1]:a[0]-b[0]));
        int s = l.get(0)[0];
        int e = l.get(0)[1];
        List<int[]> temp = new ArrayList<>();
        for(int i=1;i<l.size();i++)
        {
            if(l.get(i)[0] > e)
            {
                temp.add(new int[]{s,e});
                s = l.get(i)[0];
                e = Math.max(l.get(i)[1],e);
                continue;
            }
            e = Math.max(l.get(i)[1],e);
        }
        temp.add(new int[]{s,e});
        int res[][] = new int[temp.size()][2];
        for(int i=0;i<temp.size();i++)
        {
            // System.out.println(temp.get(i)[0]+" "+temp.get(i)[1]);
            res[i] = temp.get(i);
            // res[i][1] = temp[i][1];
        }
        return res;
    }
}
