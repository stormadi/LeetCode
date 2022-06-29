class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> line = new LinkedList<>();
        for(int i = 0; i < tickets.length; i++)
        {
            line.add(tickets[i]);
        }
        int count = tickets[k];
        int front;
        int time = 0;
        while(count != 0)
        {
            for(int i = 0; i < line.size(); i++)
            {
                time++;
                if(i == k)
                {
                    count--;
                    if(count == 0) break;
                }
                front = line.remove();
                front--;
                if(front == 0)
                {
                    i--;
                    if(i < k) k--;
                    continue;
                }
                else
                {
                   line.add(front); 
                }
            }
        }
        return time;
    }
}