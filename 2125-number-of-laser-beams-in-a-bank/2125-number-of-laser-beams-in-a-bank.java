class Solution
{
    public int numberOfBeams(String[] bank) 
    {
        if(bank.length == 1) return 0;
        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        for(String s : bank)
        {
            int deviceCount = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(s.charAt(i) == '1') deviceCount++;
            }
            if(deviceCount != 0) list.add(deviceCount);
        }
        if(list.size() == 1) return 0;
        for(int i = 1; i < list.size(); i++)
        {
            total += list.get(i)*list.get(i-1);
        }
        return total;
    }
}