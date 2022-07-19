class Solution
{
    public String destCity(List<List<String>> paths)
    {
        HashMap<String, String> map = new HashMap<>();
        String dest = paths.get(0).get(0);
        for(int i = 0; i < paths.size(); i++)
        {
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        while(map.containsKey(dest))
        {
            dest = map.get(dest);
        }
        return dest;
    }
}