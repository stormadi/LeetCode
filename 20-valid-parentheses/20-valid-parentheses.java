class Solution
{
    public boolean isValid(String s) 
    {
         if (s.length() == 0)
         {
             return true;
         }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (!stack.isEmpty())
            {
                Character leftBracket = stack.peek();
                if (leftBracket == '(' && c == ')' || leftBracket == '{' && c == '}' || leftBracket == '[' && c == ']') 
                {
                    stack.pop();
                } 
                else
                {
                    stack.push(c);
                }

            } 
            else 
            {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }
}