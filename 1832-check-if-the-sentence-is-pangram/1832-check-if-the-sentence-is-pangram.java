class Solution
{
    public boolean checkIfPangram(String sentence) 
    {
        HashMap<Character, Integer> map = new HashMap<>();
        char al = 'a';
        for(int i = 0; i < 26; i++)
        {
            map.put(al, 0);
            al++;
        }
        for(int i = 0; i < sentence.length(); i++)
        {
            int value = map.get(sentence.charAt(i));
            map.put(sentence.charAt(i), value+1);
        }
        for(char alp = 'a'; alp <= 'z'; alp++)
        {
            if(map.get(alp) == 0) return false;
        }
        return true;
    }
}