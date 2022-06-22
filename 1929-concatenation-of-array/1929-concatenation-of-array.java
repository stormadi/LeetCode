class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length*2];
        int i = 0,j = 0;
        while(j != ans.length-1)
        {
            if(i == nums.length) i=0;
            ans[j] = nums[i];
            i++;
            j++;
        }
        ans[j] = nums[nums.length-1];
        return ans;
    }
}