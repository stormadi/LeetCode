class Solution {
    boolean val;
    public boolean isPowerOfThree(int n) {
        if(n == 0)
        {
            return false;
        }
        if(n == 1)
        {
            val = true;
            return val;
        }
        if(n%3 == 0)
        {
            isPowerOfThree(n/3);
            return val;
        }
        else
        {
            val = false;
            return val;
        }
    }
}