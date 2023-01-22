class Solution {
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        dfs(s,0,new ArrayList<>());
        return res;
    }
    public void dfs(String s,int index,List<String> l)
    {
        if(index == s.length())
        {
            res.add(new ArrayList<>(l));
            return ;
        }
        for(int i=index;i<s.length();i++)
        {
            String s1 = s.substring(index,i+1);
            if(isPalindrome(s1))
            {
                l.add(s1);
                dfs(s,i+1,l);
                l.remove(l.size()-1);
            }
            
        }
    }
    public boolean isPalindrome(String s1)
    {
        int n = s1.length();
        for(int i=0;i<n/2;i++)
        {
            if(s1.charAt(i) != s1.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;

    }
}
