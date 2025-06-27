// Last updated: 6/27/2025, 11:42:43 AM
class Edge{
    int target;
    int weight;
    Edge(int target, int weight){
        this.target = target;
        this.weight = weight;
    }
}

class Node implements Comparable<Node>{
    int id;
    int dist;
    Node(int id, int dist){
        this.id = id; 
        this.dist = dist; 
    }
    @Override
    public int compareTo(Node other){
        return Integer.compare(this.dist, other.dist);
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Edge>> a = new ArrayList<>();
        for(int i = 0; i <= n; i++) a.add(new ArrayList());
        for(int[] t : times) a.get(t[0]).add(new Edge(t[1], t[2]));
        return dk(a, k);
    }

    static int dk(List<List<Edge>> gr, int src){
        int dist[] = new int[gr.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<Node> min =  new PriorityQueue<>();
        min.offer(new Node(src, 0));

        while(!min.isEmpty()){
            Node cur = min.poll();
            int u = cur.id;
            int d = cur.dist;
            if(d > dist[u]) continue;
            for(Edge e : gr.get(u)){
                int v = e.target;
                int w = e.weight;
                if(dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                    min.offer(new Node(v, dist[v]));
                }
            }
        }
        int maxdist = Arrays.stream(dist, 1, dist.length).max().orElse(Integer.MAX_VALUE);
        return maxdist == Integer.MAX_VALUE ? -1 : maxdist;
    }
}