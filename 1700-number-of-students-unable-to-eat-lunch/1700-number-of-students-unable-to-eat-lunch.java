class Solution
{
    public void pushBTM(int data,Stack<Integer> stu)
    {
        if(stu.isEmpty())
        {
            stu.push(data);
            return;
        }
        int top = stu.pop();
        pushBTM(data,stu);
        stu.push(top);
    }
    
    public int countStudents(int[] students, int[] sandwiches)
    {
        int data,count = 0;
        
        Stack<Integer> st = new Stack<>();
        for(int i = students.length-1; i >= 0; i--)
        {
            st.push(students[i]);
        }
        
        Stack<Integer> sa = new Stack<>();
        for(int i = sandwiches.length-1; i >= 0; i--)
        {
            sa.push(sandwiches[i]);
        }
        
        while(!st.isEmpty())
        {
            if(count == st.size())
            {
                return st.size();
            }
            if(st.peek() == sa.peek())
            {
                st.pop();
                sa.pop();
                count = 0;
                continue;
            }
            data = st.pop();
            pushBTM(data, st);
            count++;
        }
        return 0;
    }
}