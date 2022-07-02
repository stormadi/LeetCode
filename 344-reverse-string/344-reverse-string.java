class Solution {
    public void reverseString(char[] s) {
        int idx = 0;
        reverse(s,idx);
    }
    void reverse(char[] s, int idx)
    {
        if(idx > s.length - idx - 1)
        {
            return;
        }
        char temp = ' ';
        temp = s[idx];
        s[idx] = s[s.length - idx - 1];
        s[s.length - idx -1] = temp;
        reverse(s, idx+1);
    }
}