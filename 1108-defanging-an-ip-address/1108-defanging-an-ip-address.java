class Solution {
    public String defangIPaddr(String address) {
        String newaddr = address.replace(".","[.]");
        return newaddr;
    }
}