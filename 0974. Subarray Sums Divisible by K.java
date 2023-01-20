class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int mod[] = new int[k];
        mod[0] = 1;
        int pre = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++)
        {
            pre += nums[i];
            res += mod[((pre%k)+k)%k];
            mod[((pre%k)+k)%k]++;
        }
        return res;
    }
}
