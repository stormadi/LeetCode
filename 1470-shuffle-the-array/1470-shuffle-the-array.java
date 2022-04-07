class Solution {
    public int[] shuffle(int[] nums, int n) {
        int xc = 0;
        int yc = 0;
        int k = 0;
        int[] x = new int[n];
        int[] y = new int[nums.length-n];
        int[] out = new int[nums.length];
        for(int i=0;i<n;i++)
        {
            x[i]=nums[k];
            k++;
        }
        for(int i=0;i<nums.length-n;i++)
        {
            y[i]=nums[k];
            k++;
        }
        for(int i = 0; i < nums.length;i++)
        {
            if((i&1)==0)
            {
                out[i] = x[xc];
                xc++;
            }
            else
            {
                out[i] = y[yc];
                yc++;
            }
        }
        return out;
    }
}