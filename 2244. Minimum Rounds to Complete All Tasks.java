class Solution {
    public int minimumRounds(int[] tasks) {
        int l = tasks.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<l;i++)
        {
            map.put(tasks[i],map.getOrDefault(tasks[i],0)+1);
        }
        int res = 0;
        for(int r:map.values())
        {
            if(r==1)
            {
                return -1;
            }
            res += (r/3)+((r%3!=0)?1:0);

        }
        return res;
    }
}
