class Solution
{
    public int rec(int n, int k)
    {
        if(n==1)
        {
            return 0;
        }
        int x = rec(n-1,k);
        int y = (x+k) % n;
        return y;
    }
    public int findTheWinner(int n, int k)
    {
        int res = rec(n,k);
        return res+1;
    }
}