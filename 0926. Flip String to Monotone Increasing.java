class Solution {
    public int minFlipsMonoIncr(String s) {
        int res = 0;
        int o = 0;
        for(char c:s.toCharArray())
        {
            if(c == '1')
            {
                o++;
            }
            else if(o > 0)
            {
                o--;
                res++;
            }
        }
        return res;
    }
}
