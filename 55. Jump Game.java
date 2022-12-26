class Solution {
    public boolean canJump(int[] nums) {
        int l = nums.length;
        int res = 0;
        if(l == 1)
        {
            return true;
        }
        if(nums[0] == 0)
        {
            return false;
        }
        for(int i=0;i<l-1;i++)
        {
            if(res < i)
            {
                return false;
            }
            res = Math.max(nums[i]+i,res);
        }
        System.out.println(res);
        return res>=l-1;
    }
}
