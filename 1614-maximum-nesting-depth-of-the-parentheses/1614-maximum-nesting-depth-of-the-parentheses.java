class Solution {
    public int maxDepth(String s) {
        Stack<Character> list = new Stack<>();
        int temp = 0, res = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                list.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')')
            {
                temp = list.size();
                list.pop();
                if(temp>res)
                {
                    res = temp;
                }
            }
        }
        return res;
    }
}