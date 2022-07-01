class Solution {
    boolean val;
    public boolean isPowerOfTwo(int n) {
        if(n == 0)
        {
            return false;
        }
        if(n == 1)
        {
            val = true;
            return val;
        }
        if(n%2 == 0)
        {
            isPowerOfTwo(n/2);
            return val;
        }
        else
        {
            val = false;
            return val;
        }
    }
}