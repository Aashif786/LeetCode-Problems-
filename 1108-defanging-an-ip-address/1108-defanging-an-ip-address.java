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