class Solution {
    public int maxPoints(int[][] points) {
        int l = points.length;
        int max = 0;
        for(int i=0;i<l;i++)
        {
            Map<Double,Integer> map = new HashMap<>();
            for(int j=0;j<l;j++)
            {
                if(i == j)
                {
                    continue;
                }
                double slope = 0;
                if(points[i][0] == points[j][0])
                {
                    slope = Double.POSITIVE_INFINITY;
                }
                else
                {
                    slope = (points[j][1]-points[i][1])/(double)(points[j][0]-points[i][0]);
                }

                map.put(slope,map.getOrDefault(slope,0)+1);
                max = Math.max(map.get(slope),max);
            }
        }
        return max+1;
    }
}
