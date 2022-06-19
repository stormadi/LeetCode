class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0; //for storing number of unique elements
        int curr = 101; //for storing current unique number
        for(int i = 0; i < nums.length; i++)
        {
            if(curr != nums[i])
            {
                curr = nums[i];
                nums[count] = curr;
                count++;
            }
        }
        
        return count;
    }
}