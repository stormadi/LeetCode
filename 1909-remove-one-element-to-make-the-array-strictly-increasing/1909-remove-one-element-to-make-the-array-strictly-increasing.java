class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int arr[] = new int[nums.length-1];
        int count = 0; //to keep count of which index to ignore
        int k = 0; //to correctly insert in new array
        if(nums.length == 2) return true; //edge case
        while(count < nums.length) //brute force
        {
            //loop to copy the given array to our own array of size 1 less than the given array
            for(int i = 0; i < nums.length; i++)
            {
                if(i == count) continue;
                else
                {
                    arr[k] = nums[i];
                    k++;
                }
            }
            count++; //increment to correctly track which index to ignore in the next loop
            //loop to check if valid array is formed or not
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