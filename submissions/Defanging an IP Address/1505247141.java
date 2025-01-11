# Title: Defanging an IP Address
# Submission ID: 1505247141
# Status: Accepted
# Date: January 11, 2025 at 10:03:08 PM GMT+5:30

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s= new StringBuilder();
        s.append("");
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.') s.append("[.]");
            else s.append(address.charAt(i));
        }
        
        return s.toString();
        // return address.replaceAll("[^0-9]","[.]");
    }
}