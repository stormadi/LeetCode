class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        double median;
        int arr[] = new int[nums1.length + nums2.length];
        int temp = 0;
        int i=0; 
        int j=0;
        while (i < nums1.length && j < nums2.length) 
        {
            if (nums1[i] <= nums2[j])
            {
                arr[temp++] = nums1[i++];
            }
            else
            {
                arr[temp++] = nums2[j++];
            }
        }
        while (i < nums1.length)
        {
            arr[temp++] = nums1[i++];
        }
        while (j < nums2.length)
        {
            arr[temp++] = nums2[j++];
        }
        if(arr.length%2 != 0)
        {
            median = (double) arr[((arr.length+1)/2)-1];
        }
        else
        {
            median = (double) (arr[arr.length/2] + arr[(arr.length/2)-1])/2;
        }
        return median;
    }
}