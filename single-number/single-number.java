class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        if(nums.length == 1)
        {
            ans = nums[0];
        }
        Arrays.sort(nums);
        if(ans == 0) 
        {
            for(int i = 0; i < nums.length-1; i++)
            {
                if(nums[i] != nums[i+1])
                {
                    ans = nums[i];
                    break;
                }
                i++;
                if(i == nums.length-2)
                {
                    ans = nums[nums.length-1];
                    break;
                }
            } 
        }
        return ans;
    }
}