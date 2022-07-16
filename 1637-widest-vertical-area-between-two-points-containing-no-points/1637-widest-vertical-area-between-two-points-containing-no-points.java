class Solution
{
    public int maxWidthOfVerticalArea(int[][] points)
    {
        int max = 0;
        int[] arr = new int[points.length];
        for(int i = 0; i < points.length; i++)
        {
            arr[i] = points[i][0];
        }
        Arrays.sort(arr);
        for(int i = 0; i < points.length - 1; i++)
        { 
            if(max < arr[i+1] - arr[i]) max = arr[i+1] - arr[i];
        }
        return max;
    }
}