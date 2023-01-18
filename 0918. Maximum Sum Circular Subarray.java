class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE,res = 0,currMax = 0,currMin = 0,total = 0;
        for(int n:nums)
        {
            currMax = Math.max(n,currMax+n);
            max = Math.max(max,currMax);
            currMin = Math.min(n,currMin+n);
            min = Math.min(min,currMin);
            total+=n;
        }
        return max > 0 ? Math.max(total-min,max):max;
    }
}
