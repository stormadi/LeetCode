class SeatManager 
{
    PriorityQueue<Integer> min;
    int count;
    public SeatManager(int n) 
    {
        min = new PriorityQueue<>();
        count = 1;
    }
    public int reserve() 
    {
        if(min.size() == 0) return count++;
        return min.remove();
    }
    public void unreserve(int seatNumber)
    {
        min.add(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */