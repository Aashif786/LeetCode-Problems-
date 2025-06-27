// Last updated: 6/27/2025, 11:42:12 AM

class Solution {
    public int[] decompressRLElist(int[] arr) {
        List <Integer> l = new ArrayList<>();
        for(int i=0;i<arr.length;i+=2){
            for(int j=0;j<arr[i];j++) l.add(arr[i+1]);
        }
        int[] a = l.stream().mapToInt(Integer::intValue).toArray(); 
        return a;
    }
}