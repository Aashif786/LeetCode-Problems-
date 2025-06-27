// Last updated: 6/27/2025, 11:42:31 AM
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f = 0, t = 0;
        for(int i = 0; i < bills.length; i++)
        {
            if(bills[i] == 5) f++;

            if(bills[i] == 10){
                if(f==0) return false;
                else { t++; f--; }
            }
            
            else if(bills[i] == 20){
                if(t > 0 && f > 0) { t--; f--; }
                else if(f > 2) f -= 3;
                else return false;
            }
        }
        return true;
    }
}