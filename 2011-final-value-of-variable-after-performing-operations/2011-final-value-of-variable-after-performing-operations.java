class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        List<String> inList = new ArrayList<>(Arrays.asList(operations));
        for(String op : inList)
        {
            if(op.contains("X++") || op.contains("++X"))
            {
                value++;
            }
            else
            {
                value--;
            }
        }
        return value;
    }
}