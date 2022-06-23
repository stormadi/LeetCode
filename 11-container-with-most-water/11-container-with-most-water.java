class Solution {
    public int maxArea(int[] height) {
        int maxVol = 0;
        int start = 0;
        int end = height.length-1;
        while(start<end)
        {
            maxVol = Math.max(maxVol, (end-start)*Math.min(height[start],height[end]));
            if(height[start] > height[end])
            {
                end--;
            }
            else start++;
        }
        return maxVol;
    }
}