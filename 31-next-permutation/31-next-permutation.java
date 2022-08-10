class Solution
{
    public void nextPermutation(int[] A)
    {
        if(A == null && A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i+1]) i--;    //step 1 (find break point)
        int j = A.length - 1;
        if(i >= 0)
        {
            while(A[j] <= A[i]) j--;            //step 2 (find the next biggest element than index i)
            int tmp = A[i];                     //step 3 start (swap index i and j)
            A[i] = A[j];
            A[j] = tmp;                         //step 3 end
        }
        j = A.length - 1;
        i++;
        while(i < j)                            //step 4 (reverse the array after index i + 1)
        {
            int tmp = A[i];
            A[i] = A[j];
            A[j] = tmp;
            i++;
            j--;
        }
    }
}