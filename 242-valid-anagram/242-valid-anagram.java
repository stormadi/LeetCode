class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray())
        {
            if(!map.containsKey(c)) return false;
            else
            {
                if(map.get(c) == 1) map.remove(c);
                else map.put(c, map.get(c) - 1);
            }
        }
        return map.isEmpty();
    }
}