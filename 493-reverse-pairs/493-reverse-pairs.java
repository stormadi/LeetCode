class Solution
{
    public int merge(int[] nums, int low, int mid, int high)
    {
        int cnt = 0;
        int j = mid+1;
        for(int i = low; i <= mid; i++)
        {
            while(j <= high && nums[i] > 2*(long)nums[j])
            {
                j++;
            }
            cnt += (j-(mid+1));
        }
        ArrayList<Integer> list = new ArrayList<>();
        int left = low, right = mid+1;
        while(left <= mid && right <= high)
        {
            if(nums[left] <= nums[right])
            {
                list.add(nums[left++]);
            }
            else
            {
                list.add(nums[right++]);
            }
        }
        while(left <= mid)
        {
            list.add(nums[left++]);
        }
        while(right <= high)
        {
            list.add(nums[right++]);
        }
        for(int i = low; i <= high; i++)
        {
            nums[i] = list.get(i - low);
        }
        return cnt;
    }
    public int mergeSort(int[] nums, int low, int high)
    {
        if(low >= high) return 0;                 //single element check
        int mid = (low + high)/2;                 //computing mid
        int inv = mergeSort(nums, low, mid);      //compute left half
        inv += mergeSort(nums, mid+1, high);      //compute right half
        inv += merge(nums, low, mid, high);       //to merge the divided array
        return inv;
    }
    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums, 0, nums.length-1);
    }
}