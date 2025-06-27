// Last updated: 6/27/2025, 11:44:41 AM
class Solution {
    public int[] searchRange(int[] a, int target) {
        int i = 0, j = -1; 
        boolean found = false;
        int n = a.length;

        while (i < n) {
            if (a[i] == target) {
                if (!found) {  
                    j = i;
                    found = true;
                }
            } else if (found) { 
                break;
            }
            i++;
        }
        
        return found ? new int[] {j, i - 1} : new int[] {-1, -1};
    }
}
