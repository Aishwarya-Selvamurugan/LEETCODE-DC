class Solution {
    public int numTilings(int n) {
        if(n<=1)
        {
            return 1;
        }
        int a = 0,b = 1,c = 1,d=0;
        for(int i=2;i<=n;i++)
        {

            d = (int)((c*2)%(1e9+7) + a)%(int)(1e9+7);
            a = b;
            b = c;
            c = d;

        }
        return c;
    }
}

// =====================================================
// A[n] = A[n-1]*2 + A[n-3] -> This is the sequence.
