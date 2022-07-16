class Solution
{
    public String decodeMessage(String key, String message) 
    {
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        char ch;
        char k = 'a';
        for(int i = 0; i < key.length(); i++)
        {
            ch = key.charAt(i);
            if(!set.contains(ch) && ch != ' ')
            {
                set.add(ch);
                map.put(ch, k);
                k++;
            }
        }
        StringBuilder str = new StringBuilder(message);
        for(int i = 0; i < str.length(); i++)
        {
            ch = str.charAt(i);
            if(ch != ' ')
            {
                ch = map.get(ch);
                str.setCharAt(i, ch);
            }
        }
        return String.valueOf(str);
    }
}