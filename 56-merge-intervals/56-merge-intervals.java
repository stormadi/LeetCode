class Solution 
{
    public int[][] merge(int[][] in)
    {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(in, (a,b) -> a[0] - b[0]);
        int start = in[0][0];
        int end = in[0][1];
        for(int[] i : in)
        {
            if(i[0] <= end)
            {
                end = Math.max(end, i[1]);
            }
            else
            {
                list.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        list.add(new int[]{start, end});
        return list.toArray(new int[0][]);
    }
}