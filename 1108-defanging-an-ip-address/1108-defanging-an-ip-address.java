class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("[^0-9]","[.]");
    }
}