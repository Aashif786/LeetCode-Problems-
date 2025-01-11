# Title: Defanging an IP Address
# Submission ID: 1505242827
# Status: Accepted
# Date: January 11, 2025 at 09:58:47 PM GMT+5:30

class Solution {
    public String defangIPaddr(String address) {
        return address.replaceAll("[^0-9]","[.]");
    }
}