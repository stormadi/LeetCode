class Solution {
    public String removeOuterParentheses(String s) {
        String res = "" ;
        int check = 0 ;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                check++ ;
                if (check >= 2) {
                    res += s.charAt(i) ;
                }
            }
            else {
                if (check >= 2) {
                    res += s.charAt(i) ;
                }
                check-- ;
            }
        }
        
        return res ;
    }
}