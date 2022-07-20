class Solution 
{
    public boolean areOccurrencesEqual(String s)
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            char str = s.charAt(i);
            if(!map.containsKey(str))
            {
                map.put(str, 1);
            }
            else
            {
                int value = map.get(str);
                map.put(str, ++value);
            }
        }
        int val = map.get(s.charAt(0));
        for(Map.Entry<Character, Integer> m : map.entrySet())
        {
            if(m.getValue() != val) return false;
        }
        return true;
    }
}