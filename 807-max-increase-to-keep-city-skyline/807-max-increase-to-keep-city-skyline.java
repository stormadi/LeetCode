class Solution
{
    public int maxIncreaseKeepingSkyline(int[][] grid)
    {
        int[] rowMax = new int[grid.length];
        int[] colMax = new int[grid.length];
        int total = 0;
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                rowMax[i] = Math.max(rowMax[i], grid[i][j]);
                colMax[j] = Math.max(colMax[j], grid[i][j]);
            }
        }
        for(int i = 0; i < grid.length; i++)
        {
            for(int j = 0; j < grid.length; j++)
            {
                total += (Math.min(rowMax[i],colMax[j]) - grid[i][j]);
            }
        }
        return total;
    }
}