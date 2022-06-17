class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Queue<Character> note = new LinkedList<>();
        for(int i = 0;i < ransomNote.length(); i++)
        {
            note.add(ransomNote.charAt(i));
        }
        StringBuilder mag = new StringBuilder(magazine);
        for(int i = 0; i < note.size(); i++)
        {
            for(int j = 0; j < mag.length(); j++)
            {
                if(note.peek() == mag.charAt(j))
                {
                    note.remove();
                    mag.setCharAt(j,'0');
                    j = -1;
                    if(note.size() == 0)
                    {
                        return true;
                    }
                    continue;
                }
                else
                {
                    if(j == mag.length() - 1)
                    {
                        return false;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        return note.size() == 0;
    }
}