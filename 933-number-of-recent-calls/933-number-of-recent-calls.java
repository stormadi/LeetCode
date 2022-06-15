class RecentCounter {
    Queue<Integer> req = new LinkedList<>();
    public RecentCounter() {
        
    }
    public int ping(int t) {
        req.add(t);
        while(!req.isEmpty() && t-req.peek()>3000)
        {
            req.remove();
        }
    return req.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */