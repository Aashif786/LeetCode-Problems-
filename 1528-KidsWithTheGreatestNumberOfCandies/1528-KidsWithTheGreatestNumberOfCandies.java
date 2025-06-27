// Last updated: 6/27/2025, 11:41:54 AM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int e) {
        int max =0;
        for(int i : candies) {
            if (max<i)max=i;
        }
        List<Boolean>  a = new ArrayList<>();
        for(int i : candies) {
            if(i+e >=max) a.add(true);
            else a.add(false);
        }
        return a;
    }
}