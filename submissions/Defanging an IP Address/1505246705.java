# Title: Defanging an IP Address
# Submission ID: 1505246705
# Status: Compile Error
# Date: January 11, 2025 at 10:02:42 PM GMT+5:30

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder s= new StringBuilder();
        sb.append("");
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.') sb.append("[.]");
            else sb.append(address.charAt(i));
        }
        
        return s.toString();
        // return address.replaceAll("[^0-9]","[.]");
    }
}