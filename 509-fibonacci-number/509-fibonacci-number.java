class Solution 
{
    int c;
    int calcfib(int n, int a, int b)
    {
        if(n == 1)
        {
            return a + b;
        }
        c = a + b;
        calcfib(n-1,b,c);
        return c;
    }
    public int fib(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        int a = 0;
        int b = 1;
        int ans = calcfib(n,a,b);
        return ans;
    }
}