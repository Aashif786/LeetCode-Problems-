# Title: Minimum Number of Moves to Seat Everyone
# Submission ID: 1508225772
# Status: Accepted
# Date: January 14, 2025 at 04:06:09 PM GMT+5:30

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