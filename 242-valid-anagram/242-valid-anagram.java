class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(t.length() != s.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            if(!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else
            {
                int value = map.get(c);
                map.put(c, value+1);
            }
        }
        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c)) return false;
            else
            {
                int value = map.get(c);
                value--;
                if(value == 0) map.remove(c);
                else map.put(c, value);
            }
        }
        return map.isEmpty();
    }
}