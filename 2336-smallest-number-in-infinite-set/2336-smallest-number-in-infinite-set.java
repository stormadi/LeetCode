class SmallestInfiniteSet {
    PriorityQueue<Integer> min;
    int count = 1;
    public SmallestInfiniteSet() 
    {
        min = new PriorityQueue<Integer>();
    }
    
    public int popSmallest()
    {
        if(min.isEmpty()) return count++;
        return min.remove();
    }
    
    public void addBack(int num) 
    {
        if(count > num && !min.contains(num)) min.add(num);
        
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */