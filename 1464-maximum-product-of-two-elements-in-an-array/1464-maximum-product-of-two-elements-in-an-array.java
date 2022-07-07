class Solution 
{
    public int maxProduct(int[] nums)
    {
        int k = 2;
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++)
        {
            min.add(nums[i]);
            if(min.size() > k)
            {
                min.remove();
            }
        }
        int second = min.remove();
        int first = min.remove();
        return (first-1)*(second-1);
    }
}