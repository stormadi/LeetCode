class Solution {
    boolean val;
    public boolean isPowerOfFour(int n) {
        if(n == 0)
        {
            return false;
        }
        if(n == 1)
        {
            val = true;
            return val;
        }
        if(n%4 == 0)
        {
            isPowerOfFour(n/4);
            return val;
        }
        else
        {
            val = false;
            return val;
        }
    }
}