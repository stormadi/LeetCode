class Solution 
{
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            min.add(nums[i]);
            if(min.size() > k)
            {
                min.remove();
            }
        }
        return min.remove();
    }
}