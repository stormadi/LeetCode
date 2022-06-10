class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> list = new Stack<>();
        int res = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                list.push(s.charAt(i));
            }
            else
            {
                if(!list.isEmpty())
                {
                    list.pop();
                }
                else
                {
                    res++;
                }
            }
        }
        res = res + list.size();
        return res;
    }
}