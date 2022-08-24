class Solution
{
    public int longestConsecutive(int[] nums)
    {
        int max = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
        {
            set.add(num);
        }
        for(int num : nums)
        {
            if(!set.contains(num - 1))
            {
                int curr = num;
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