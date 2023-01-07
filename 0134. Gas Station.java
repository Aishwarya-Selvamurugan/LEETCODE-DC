class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int res = 0;
        int ans = 0;
        int sumG = 0;
        int sumC = 0;
        for(int i=0;i<n;i++)
        {
            res = res + (gas[i]-cost[i]);
            if(res < 0)
            {
                ans = i+1;
                res = 0;
            }
            sumC += cost[i];
            sumG += gas[i];
        }
        return sumC>sumG ?-1:ans;
    }
}
