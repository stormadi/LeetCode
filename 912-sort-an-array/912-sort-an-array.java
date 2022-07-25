class Solution 
{
    public int[] sortArray(int[] nums)
    {
        int len = nums.length;
        int[] arr = new int[len];
        PriorityQueue<Integer> min = new PriorityQueue<>();
        for(int i = 0; i < len; i++)
        {
            min.add(nums[i]);
        }
        for(int i = 0; i < len; i++)
        {
            arr[i] = min.remove();
        }
        return arr;
    }
}