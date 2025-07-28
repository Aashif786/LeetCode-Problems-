// Last updated: 7/28/2025, 3:27:19 PM
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> l = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        for(String i : words) m.put(i, m.getOrDefault(i, 0) + 1);
        PriorityQueue<String> pq = new PriorityQueue<>((x, y) -> {
            int c = m.get(x) - m.get(y);
            if(c == 0) return y.compareTo(x);
            return c;
        });
        for(String w : m.keySet()){
            pq.offer(w);
            if(pq.size() > k) pq.poll();
        }
        while(!pq.isEmpty()) l.add(pq.poll());
        Collections.reverse(l);
        return l;
    }
}