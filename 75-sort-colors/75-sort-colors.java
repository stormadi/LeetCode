class Solution 
{
    public void sortColors(int[] nums) 
    {
        int countR = 0;
        int countW = 0;
        int countB = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0) countR++;
            else if(nums[i] == 1) countW++;
            else countB++;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(countR > 0)
            {
                nums[i] = 0;
                countR--;
            }
            else if(countW > 0)
            {
                nums[i] = 1;
                countW--;
            }
            else
            {
                nums[i] = 2;
                countB--;
            }
        }
    }
}