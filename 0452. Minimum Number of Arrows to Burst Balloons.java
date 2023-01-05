class Solution {
    public int findMinArrowShots(int[][] points) {
        int l = points.length;
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        // for(int i=0;i<l;i++)
        // {
        //     System.out.println(points[i][0]+" "+points[i][1]);
        // }
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<l;i++)
        {
            if(list.size()==0)
            {
                list.add(new int[]{points[i][0],points[i][1]});
            }
            else
            {
                int s[] = list.get(list.size()-1);
                if(s[1] >= points[i][0])
                {
                    
                    list.remove(list.size()-1);
                    list.add(new int[]{Math.max(points[i][0],s[0]),Math.min(s[1],points[i][1])});
                    // System.out.println(Math.max(points[i][0],s[0])+" "+Math.min(s[1],points[0][1]));
                }
                else
                {
                    list.add(new int[]{points[i][0],points[i][1]});
                }
            }
        }
        return list.size();
    }
}
