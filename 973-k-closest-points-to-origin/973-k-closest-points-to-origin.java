class Solution
{
    public int[][] kClosest(int[][] points, int k) 
    {
        if(k == points.length) return points;
        PriorityQueue<int[]> max = new PriorityQueue<>((a,b) -> (b[0]*b[0] + b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1]));
        int[][] ans = new int[k][2];
        for(int[] point : points)
        {
            max.add(point);
            if(max.size() > k) max.remove();
        }
        for(int i = 0; i < k; i++)
        {
            ans[i] = max.remove();
        }
        return ans;
    }
}