class Solution 
{
    public int solve(int i, int j, int m, int n, int[][] matrix)
    {
        if(i >= n || j >= m)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        if(i < n && j < m && matrix[i][j] != 0)
        {
            return matrix[i][j];
        }
        else return matrix[i][j] = solve(i+1, j, m, n, matrix) + solve(i, j+1, m, n, matrix);
    }
    public int uniquePaths(int m, int n)
    {
        int i = 0, j = 0;
        int[][] mat = new int[n][m];
        int res = solve(i, j, m, n, mat);
        return res;
    }
}