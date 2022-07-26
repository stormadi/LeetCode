class Solution
{
    public void rotate(int[][] a)
    {
        int l = 0, r =a.length-1;
        while(l < r){
            int[] t = a[l];
            a[l] = a[r];
            a[r] = t;
            l++;
            r--;
        }
        
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
    }
}
