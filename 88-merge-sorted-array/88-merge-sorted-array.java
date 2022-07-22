class Solution 
{
    public void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int point1 = m - 1, point2 = n - 1, i = m + n - 1;
        while(point2 >= 0)
        {
            if(point1 >= 0 && nums1[point1] > nums2[point2])
            {
                nums1[i--] = nums1[point1--];
            }
            else
            {
                nums1[i--] = nums2[point2--];
            }
        }
    }
}