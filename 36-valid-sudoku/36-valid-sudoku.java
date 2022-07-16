class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        HashSet<String> set = new HashSet<>();
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] != '.')
                {
                    char num = board[i][j];
                    if(!set.add("r"+i+num) || !set.add("c"+j+num) || !set.add("r"+(i/3)+"c"+(j/3)+num)) return false;
                }
            }
        }
        return true;
    }
}