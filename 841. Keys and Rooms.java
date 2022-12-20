class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] v = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<rooms.get(0).size();i++)
        {
            q.add(rooms.get(0).get(i));
        }
        v[0] = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int a = q.remove();
                if(!v[a]){
                v[a] = true;
                for(int j=0;j<rooms.get(a).size();j++)
                {
                    q.add(rooms.get(a).get(j));
                }
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!v[i])
            {
                return false;
            }
        }
        return true;
    }
}
