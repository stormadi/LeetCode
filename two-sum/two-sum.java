class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++)
        {
            arr.add(nums[i]);
        }
        int ans[] = new int[2];
        int b;
        for(int i = 0; i < nums.length; i++)
        {
            b = target - nums[i];
            if(arr.contains(b))
            {
                if(arr.indexOf(b) != i)
                {
                    ans[0] = i;
                    ans[1] = arr.indexOf(b);
                    break; 
                }
            }
        }
        return ans;
    }
}