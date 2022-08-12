class Solution
{
    public int maxProfit(int[] p)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < p.length; i++)
        {
            if(p[i] < min) min = p[i];
            if((p[i] - min) > max) max = p[i] - min;
        }
        return max;
    }
}