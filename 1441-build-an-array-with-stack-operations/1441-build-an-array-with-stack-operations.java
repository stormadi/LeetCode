class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(count != target.length)
            {
                if(target[count] == i+1)
                {
                    ans.add("Push");
                    count++;
                }
                else
                {
                    ans.add("Push");
                    ans.add("Pop");
                }
            }
            else
            {
                break;
            }
        }
        return ans;
    }
}