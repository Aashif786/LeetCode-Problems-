class Solution {
    public String convertDateToBinary(String date) {
        return Integer.toString(Integer.parseInt(date.substring(0,4)),2)+"-"+Integer.toString(Integer.parseInt(date.substring(5,7)),2)+"-"+Integer.toString(Integer.parseInt(date.substring(8,10)),2);
    }
}