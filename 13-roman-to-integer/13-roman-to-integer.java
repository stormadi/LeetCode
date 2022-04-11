class Solution
{
    public int romanToInt(String s)
    {
        HashMap<Character, Integer> hm = new HashMap<>();
        int sum = 0;
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        Character[] arr = new Character[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i);
        }
        for(int i = 0; i < s.length(); i++)
        {
            int flag = 0;
            if((arr[i].equals('I')) && (i!=s.length()-1) && flag == 0)
            {
                if(arr[i+1].equals('V'))
                {
                    sum += 4;
                    i++;
                    flag = 1;
                }
                else if(arr[i+1].equals('X'))
                {
                    sum += 9;
                    i++;
                    flag = 1;
                }
            }
            if((arr[i].equals('X')) && (i!=s.length()-1) && flag == 0)
            {
                if(arr[i+1].equals('L'))
                {
                    sum += 40;
                    i++;
                    flag = 1;
                }
                else if(arr[i+1].equals('C'))
                {
                    sum += 90;
                    i++;
                    flag = 1;
                }
            }
            if((arr[i].equals('C')) && (i!=s.length()-1) && flag == 0)
            {
                if(arr[i+1].equals('D'))
                {
                    sum += 400;
                    i++;
                    flag = 1;
                }
                else if(arr[i+1].equals('M'))
                {
                    sum += 900;
                    i++;
                    flag = 1;
                }
            }
            if(hm.containsKey(arr[i]) && flag == 0)
            {
                sum += hm.get(s.charAt(i));
            }
        }
        return sum;
    }
}