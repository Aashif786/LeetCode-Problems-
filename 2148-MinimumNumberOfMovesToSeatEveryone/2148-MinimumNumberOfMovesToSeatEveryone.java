// Last updated: 6/27/2025, 11:41:21 AM
import java.util.Arrays;
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int mv=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<seats.length;i++) mv+=Math.abs(seats[i]-students[i]);
        return mv;
    }
}