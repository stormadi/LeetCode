class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        int temp,temp1,sum = 0;
        for(int i = 0; i < ops.length; i++)
        {
            if(ops[i].equals("C"))
            {
                st.pop();
                continue;
            }
            if(ops[i].equals("D"))
            {
                temp = st.peek();
                st.push(temp*2);
                continue;
            }
            if(ops[i].equals("+"))
            {
                temp = st.pop();
                temp1 = st.pop();
                st.push(temp1);
                st.push(temp);
                st.push(temp + temp1);
                continue;
            }
            st.push(Integer.parseInt(ops[i]));
        }
        while(!st.isEmpty())
        {
            sum = sum + st.pop();
        }
        return sum;
    }
}