class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(i==0)
            {
                sum[0] = nums[0];    
            }
            else
            {
                sum[i] = nums[i] + sum[i-1];
            }
        }
        return sum;
    }
}