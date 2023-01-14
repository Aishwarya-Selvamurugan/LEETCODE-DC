class Solution {
    int a[] = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n = s1.length();
        for(int i=0;i<26;i++)
        {
            a[i] = i;
        }
        for(int i=0;i<n;i++)
        {
            int x = find(s1.charAt(i)-'a');
            int y = find(s2.charAt(i)-'a');
            if(x<y)
            {
                a[y] = x;
            }
            else
            {
                a[x] = y;
            }
        }
        String res = "";
        for(char c:baseStr.toCharArray())
        {
            res += (char)(find(c-'a')+'a')+"";
        }
        return res;
    }
    public int find(int i)
    {
        if(i == a[i])
        {
            return i;
        }
        return a[i] = find(a[i]);
    }
}
