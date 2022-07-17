class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int row = 0, col = 0;
        int flag = 1;//1->row, 0->col
        int boundary = m-1;
        int sizeRow = n-1;
        int sizeCol = m-1;
        char move = 'r';
        for(int i = 0; i < m*n; i++)
        {
            list.add(matrix[row][col]);
            if(i == boundary)
            {
                if(flag == 1)
                {
                    boundary += sizeRow;
                    sizeRow--;
                    flag = 0;
                }
                else
                {
                    boundary += sizeCol;
                    sizeCol--;
                    flag = 1;
                }
                switch(move)
                {
                    case 'r':
                        move = 'd';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                }
            }
            switch(move)
            {
                case 'r':
                    col += 1;
                    break;
                case 'd':
                    row += 1;
                    break;
                case 'l':
                    col -= 1;
                    break;
                case 'u':
                    row -= 1;
                    break;
            }
        }
        return list;
    }
}