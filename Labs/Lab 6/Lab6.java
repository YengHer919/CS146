import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6 {
	public static boolean canFinish(int numCourses, int[][] prerequisites) {
		Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] prerequisite : prerequisites) {
            int from = prerequisite[1];
            int to = prerequisite[0];
            if (!graph.containsKey(to)) {
                graph.put(to, new ArrayList<>());
            }
            graph.get(to).add(from);
        }

        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i] && hasCycle(graph, i, visited)) {
                return false;
            }
        }

        return true;
    }

    private static boolean hasCycle(Map<Integer, List<Integer>> graph, int i, boolean[] visited) {
        if (visited[i]) return true; 
        visited[i] = true;

        List<Integer> neighbors = graph.get(i);
        if (neighbors == null) {
            neighbors = new ArrayList<>();
            graph.put(i, neighbors);
        }
        for (int neighbor : neighbors) {
            if (hasCycle(graph, neighbor, visited)) {
                return true; 
            }
        }
        visited[i] = false; 
        return false;
    }

    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        System.out.println(canFinish(numCourses, prerequisites)); 
        

        int numCourse = 2;
        int[][] prerequisite = {{1, 0}};
        System.out.println(canFinish(numCourse, prerequisite)); 
    }
}