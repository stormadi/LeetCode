class Solution
{
    public int[] countPoints(int[][] points, int[][] queries)
    {
        int x1, x2, y1, y2;
        int ans[] = new int[queries.length];
        double dist;
        for(int i = 0; i < queries.length; i++)
        {
            for(int j = 0; j < points.length; j++)
            {
                x1 = points[j][0];
                y1 = points[j][1];
                x2 = queries[i][0];
                y2 = queries[i][1];
                dist = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
                if(queries[i][2] >= dist)
                {
                    ans[i] = ans[i] + 1;
                }
            } 
        }
        return ans;
    }
}