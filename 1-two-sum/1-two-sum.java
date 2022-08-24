class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            int sec = target - nums[i];
            if(!map.containsKey(sec))
            {
                map.put(nums[i], i);
            }
            else
            {
                arr[0] = map.get(sec);
                arr[1] = i;
                break;
            }
        }
        return arr;
    }
}