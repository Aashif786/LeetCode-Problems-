// Last updated: 6/27/2025, 11:40:56 AM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        return (int) Arrays.stream(hours).filter(x -> x>=target).count();
    }
}