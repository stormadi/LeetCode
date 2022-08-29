class Solution
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        if(mat[0].length*mat.length != r*c) return mat;
        int i = 0, j = 0;
        int[][] Nmat = new int[r][c];
        for(int x = 0; x < r; x++)
        {
            for(int y = 0; y < c; y++)
            {
                if(j < mat[0].length)
                {
                    Nmat[x][y] = mat[i][j];
                    j++;
                }
                else
                {
                    if(i < mat.length-1)
                    {
                        i++;
                    }
                    j = 0;
                    Nmat[x][y] = mat[i][j];
                    j++;
                }
            }
        }
        return Nmat;
    }
}