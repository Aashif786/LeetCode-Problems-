// Last updated: 6/27/2025, 11:41:57 AM
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> h =  new HashMap<>();
        for(int i : arr){
            if(h.containsKey(i)) h.put(i, h.get(i)+1);
            else h.put(i, 1);
        }
        int res = -1;
        for(int key : h.keySet()){
            if(h.get(key) == key) res = Math.max(res, key);
        }
        return res;
    }
}