class Solution
{
    public int[] minOperations(String boxes)
    {
        int[] ans = new int[boxes.length()];
        int dist;
        for(int i = 0; i < boxes.length(); i++)
        {
            dist = 0;
            for(int j = 0; j < boxes.length(); j++)
            {
                if(i != j && boxes.charAt(j) == '1')
                {
                    dist += Math.abs(j - i);
                }
            }
            ans[i] = dist;
        }
        return ans;
    }
}