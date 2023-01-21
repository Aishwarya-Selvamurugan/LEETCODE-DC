class Solution {
    List<String> res = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        int n = s.length();
        if(n > 12)
        {
            return new ArrayList<>();
        }
        dfs(s,0,4,"");
        return res;
    }
    public void dfs(String s,int index,int dot,String str)
    {
        if(dot == 0 && index == s.length())
        {
            res.add(str.substring(0,str.length()-1));
        }
        if(dot <= 0)
        {
            return;
        }
        for(int i=index;i<Math.min(index+3,s.length());i++)
        {
            String s1 = s.substring(index,i+1);
            if(Integer.parseInt(s1) <= 255  && (index==i || s.charAt(index)!='0'))
            {
                dfs(s,i+1,dot-1,str + s1 + ".");
            }
        }

    }
}
