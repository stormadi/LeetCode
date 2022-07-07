class Solution
{
    public int maxIncreaseKeepingSkyline(int[][] grid)
    {
        int len = grid.length;
        int[] rowMax = new int[len], colMax = new int[len];
        int total = 0;
        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        for(int i = 0; i < len; i++)
        {
            for(int j = 0; j < len; j++)
            {
                total += (Math.min(rowMax[i],colMax[j]) - grid[i][j]);
            }
        }
        return total;
    }
}