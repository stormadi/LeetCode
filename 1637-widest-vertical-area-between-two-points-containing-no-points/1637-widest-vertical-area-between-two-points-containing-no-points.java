class Solution
{
    public int maxWidthOfVerticalArea(int[][] points)
    {
        int max = 0;
        int diff;
        int[] arr = new int[points.length];
        for(int i = 0; i < points.length; i++)
        {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i = 0; i < points.length - 1; i++)
        {
            diff = arr[i+1] - arr[i]; 
            if(max < diff) max = diff;
        }
        return max;
    }
}