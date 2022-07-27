class Solution 
{
    public int[] dailyTemperatures(int[] temp) 
    {
        int[] ans = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <temp.length; i++)
        {
            while(!st.isEmpty() && temp[st.peek()] < temp[i])
            {
                int index = st.pop();
                ans[index] = i - index;
            }
            st.push(i);
        }
        while(!st.isEmpty())
        {
            ans[st.pop()] = 0;
        }
        return ans;
    }
}