class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;
        int m = queries.length;
        int res[] = new int[m];
        Arrays.sort(nums);
        for(int j=0;j<m;j++)
        {
            int sum = 0,max = 0,count = 0;
            for(int i=0;i<n;i++)
            {
                if(queries[j] >= sum+nums[i])
                {
                    sum += nums[i];
                    count++;
                }
            }
            System.out.println(count);
            res[j] = count;
        }
        return res;
    }
}
