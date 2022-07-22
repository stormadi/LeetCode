class Solution 
{
    public int majorityElement(int[] nums)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        Map.Entry<Integer, Integer> majr = null;
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            if(majr == null || m.getValue() > majr.getValue())
            {
                majr = m;
            }            
        }
        return majr.getKey();
    }
}