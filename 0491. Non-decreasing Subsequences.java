class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        fun(nums,0,new ArrayList<>());
        return res;
    }
    public void fun(int[] nums,int index,List<Integer> l)
    {
        if(l.size() > 1 && !set.contains(l)){
        res.add(new ArrayList<>(l));
        set.add(new ArrayList<>(l));
        }
        if(index == nums.length)
        {
            return;
        }
        for(int i=index;i<nums.length;i++)
        {
            if(l.size() == 0 || nums[i] >= l.get(l.size()-1))
            {
            l.add(nums[i]);
            fun(nums,i+1,l);
            if(l.size() > 0)
            {
                l.remove(l.size()-1);
            }
            }
        }
    }
}
