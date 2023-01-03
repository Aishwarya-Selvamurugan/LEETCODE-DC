class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int l = strs[0].length();
        char a[] = new char[l];
        Arrays.fill(a,'a');
        int count = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(a[j] != '0' && a[j] > strs[i].charAt(j))
                {
                    count++;
                    a[j] = '0';
                }
                else if(a[j] != '0')
                {
                    a[j] = strs[i].charAt(j);
                }
            }
        }
        return count;
    }
}
