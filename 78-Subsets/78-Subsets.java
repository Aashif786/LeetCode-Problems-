class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = subset(nums);
        return l;
    }
    private List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ss = new ArrayList<>();
        ss.add(new ArrayList<>()); 
        for(int n : nums){
            int size = ss.size(); 
            for(int i = 0 ; i<size ; i++){
                List<Integer> temp = new ArrayList<>(ss.get(i));
                temp.add(n);
                ss.add(temp);
            }
        }
        return ss;
    }
}