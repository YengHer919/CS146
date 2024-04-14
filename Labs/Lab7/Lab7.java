import java.util.*;

class Lab7 {
    public static int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE/2);
            dist[i][i] = 0;
        }
        
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];
            dist[from][to] = weight;
            dist[to][from] = weight;
        }
        
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE/2 && dist[k][j] != Integer.MAX_VALUE/2) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }
        
        int minCities = Integer.MAX_VALUE;
        int minCity = -1;
        
        for (int i = 0; i < n; i++) {
            int reachableCities = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    reachableCities++;
                }
            }
            if (reachableCities <= minCities) {
                minCities = reachableCities;
                minCity = i;
            }
        }
        return minCity;
    }
    
    public static void main(String[] args) {
        int[][] edges = {{0,1,3},{1,2,1},{1,3,4},{2,3,1}};
        int n = 4;
        int distanceThreshold = 1;
        System.out.println(findTheCity(n, edges, distanceThreshold)); // Output: 0
        System.out.println(findTheCity(n, edges, 4)); // Output: 3
        
        int[][] edge = {{0,1,2},{0,4,8},{1,2,3},{1,4,2},{2,3,1},{3,4,1}};
        System.out.println(findTheCity(5, edge, 2)); // Output: 0
    }
}
