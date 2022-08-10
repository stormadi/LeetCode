class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> one;
        for(int i = 1; i <= numRows; i++)
        {
            one = new ArrayList<>();
            for(int j = 0; j < i; j++)
            {
                if(j == 0 || j == (i-1))
                {
                    one.add(1);
                }
                else
                {
                    int sum = list.get(i-2).get(j-1) + list.get(i-2).get(j);
                    one.add(sum);
                }
            }
            list.add(one);
        }
        return list;
    }
}