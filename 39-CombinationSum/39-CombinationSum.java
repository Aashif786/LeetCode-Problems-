// Last updated: 6/27/2025, 11:44:36 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>  full = new ArrayList<>();
        backtrack(full, new ArrayList<>(), 0, target, candidates);
        return full;
    }
    static void backtrack(List<List<Integer>> full, List<Integer> l, int i, int target, int a[]){
        if(sum(l) == target) { full.add(new ArrayList<>(l)); return; }
        if(sum(l) > target) return; 
        for(int j = i; j < a.length; j++){
            l.add(a[j]);
            backtrack(full, l, j, target, a);
            l.remove(l.size()-1);
        }
    }
    static int sum(List<Integer> l){
        int sum = 0; for(int i: l) sum += i; return sum;
        // return l.stream().mapToInt(Integer::intValue).sum();
    }
}