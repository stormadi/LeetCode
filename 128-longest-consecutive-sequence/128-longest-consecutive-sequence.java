class Solution
{
    public int longestConsecutive(int[] nums)
    {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(!set.contains(nums[i] - 1))
            {
                int curr = nums[i];
                int streak = 1;
                while(set.contains(curr+1))
                {
                    curr++;
                    streak++;
                }
                max = Math.max(streak, max);
            }
        }
        return max;
    }
}