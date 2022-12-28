class Solution {
    public int minStoneSum(int[] piles, int k) {
        Arrays.sort(piles);
        int l = piles.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int sum = 0;
        for(int i=0;i<l;i++)
        {
            pq.add(piles[i]);
            sum += piles[i];
        }
        while(k>0)
        {
            int a = pq.remove();
            int d = (int)(a/2.0);
            a-=d;
            sum -= d;
            pq.add(a);
            k--;
        }
        return sum;
    }
}
