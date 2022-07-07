class Solution
{
    public int lastStoneWeight(int[] stones)
    {
        int x, y, diff;
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < stones.length; i++)
        {
            max.add(stones[i]);
        }
        while(max.size() > 1 )
        {
            x = max.remove();
            y = max.remove();
            diff = x - y;
            if(diff > 0) max.add(diff);
        }
        return max.size() == 0 ? 0 : max.remove();
    }
}