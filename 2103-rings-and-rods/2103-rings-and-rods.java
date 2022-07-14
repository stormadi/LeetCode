class Solution 
{
    public int countPoints(String rings)
    {
        HashMap<Character,Set<Character>> map = new HashMap<>();
        int count = 0;
        for(int i = 1; i < rings.length(); i+=2)
        {
            if(!map.containsKey(rings.charAt(i)))
            {
                Set<Character> set = new HashSet<>();
                set.add(rings.charAt(i-1));
                map.put(rings.charAt(i),set);
            }
            else
            {
                map.get(rings.charAt(i)).add(rings.charAt(i-1));
            }
        }
        for(Set val : map.values())
        {
            if(val.size() == 3)
            {
                count++;
            }
        }
        return count;
    }
}