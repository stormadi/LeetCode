class Solution 
{
    public int[] findingUsersActiveMinutes(int[][] logs, int k) 
    {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        int[] ans = new int[k];
        for(int i = 0; i < logs.length; i++)
        {
            int id = logs[i][0];
            int time = logs[i][1];
            if(!map.containsKey(id))
            {
                map.put(id, new HashSet<Integer>());
            }
            map.get(id).add(time);
        }
        for(Map.Entry<Integer, Set<Integer>> m : map.entrySet())
        {
            int no = m.getValue().size();
            ans[no-1] += 1;
        }
        return ans;
    }
}