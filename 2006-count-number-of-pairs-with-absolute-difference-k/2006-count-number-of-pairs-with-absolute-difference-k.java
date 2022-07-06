class Solution 
{
    public int countKDifference(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int val;
        int total = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i]))
            {
                val = map.get(nums[i]);
                map.put(nums[i], ++val);
            }
            else map.put(nums[i], 1);
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(map.containsKey(nums[i] - k))
            {
                total += map.get(nums[i] - k);
            }
        }
        return total;
    }
}