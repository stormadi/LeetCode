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
        while(max.size() != 1 )
        {
            x = max.remove();
            y = max.remove();
            max.add(x-y);
        }
        return max.peek();
    }
}