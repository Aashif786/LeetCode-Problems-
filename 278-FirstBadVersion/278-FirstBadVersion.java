// Last updated: 6/27/2025, 11:43:17 AM

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int i = 1 , j = n;
        while (i < j) {
            int mid = i + (j - i) / 2;
            if (isBadVersion(mid)) j = mid;
            else i = mid + 1;
        }
        return i;
    }
}