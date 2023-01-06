class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int res = 0;
        int i = 0;
        while(i<costs.length && coins-costs[i]>=0)
        {
            coins-=costs[i++];
            res++;
        }
        return res;
    }
}
