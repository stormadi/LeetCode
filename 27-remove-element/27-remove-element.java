class Solution 
{
    public int removeElement(int[] nums, int val)
    {
        if((nums.length == 1 && nums[0] == val) || nums.length == 0) return 0;
        int ans = 0;
        int temp = -1;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == val && nums[i] != -1)
            {
                for(int j = i; j < nums.length-1; j++)
                {
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                ans++;
                i--;
            }
        }
        if(ans == 0 && nums[nums.length - 1] == val) ans++; 
        return nums.length - ans;
    }
}