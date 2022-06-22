class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int arr[] = new int[nums.length-1];
        int count = 0; //to keep count of which index to ignore
        int k = 0; //to correctly insert in new array
        if(nums.length == 2) return true;
        while(count < nums.length)
        {
            for(int i = 0; i < nums.length; i++)
            {
                if(i == count) continue;
                else
                {
                    arr[k] = nums[i];
                    k++;
                }
            }
            count++;
            for(int i = 0; i < arr.length-1; i++)
            {
                if(arr[i] >= arr[i+1])
                {
                    k = 0;
                    break;
                }
                else
                {
                    if(i == arr.length-2)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}