class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        List<Integer> list = new ArrayList<>();
        int[] arr = new int[2];
        // Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++)
        {
            list.add(nums[i]);
            int sec = target - nums[i];
            if(list.contains(sec) && i != list.indexOf(sec))
            {
                arr[0] = i;
                arr[1] = list.indexOf(sec);
                break;
            }
        }
        return arr;
    }
}