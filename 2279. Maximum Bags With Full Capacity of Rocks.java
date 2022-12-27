class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int res = 0;
        for(int i=0;i<n;i++)
        {
            capacity[i] -= rocks[i];
        }
        Arrays.sort(capacity);
        int i = 0;
        while(i<n && additionalRocks > 0)
        {
            additionalRocks -= capacity[i];
            i++;
            if(additionalRocks >= 0)
            {
                res++;
            }
        }
        return res;
    }
}
