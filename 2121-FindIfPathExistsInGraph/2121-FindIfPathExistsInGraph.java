// Last updated: 6/27/2025, 11:41:25 AM
import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] e, int st, int end) {
        List<List<Integer>> a = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(new ArrayList<>());
        for (int[] ed : e) {
            a.get(ed[0]).add(ed[1]);
            a.get(ed[1]).add(ed[0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(st);
        visited[st] = true;
        while (!q.isEmpty()) {
            int node = q.poll();
            if (node == end) return true;
            for (int neighbor : a.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return false;
    }
}
