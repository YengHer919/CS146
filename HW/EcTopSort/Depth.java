import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Depth {
    public static class Node {
        ArrayList<Integer> prereq = new ArrayList<>();
        ArrayList<Node> under = new ArrayList<>();
        int inDegree = 0;
        int val;
        
        public Node(int i) {
            val = i;
        }
        
        public int getVal() {
            return val;
        }
        
        public void addPrereq(int n) {
            prereq.add(n);
        }
        
        public void addUnder(Node n) {
            under.add(n);
        }
        
        public void incrementDegree() {
            inDegree++;
        }
        
        public void decrementDegree() {
            if (inDegree > 0) {
                inDegree--;
            }
        }
        
        public int getDegree() {
            return inDegree;
        }
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Node> nodes = new ArrayList<>();
        ArrayList<Integer> classes = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            nodes.add(new Node(i));
        }

        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int pre = prereq[1];
            nodes.get(course).addPrereq(pre);
            nodes.get(course).incrementDegree();
            nodes.get(pre).addUnder(nodes.get(course));
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (nodes.get(i).getDegree() == 0) {
                stack.push(i);
            }
        }

        while (!stack.isEmpty()) {
            int course = stack.pop();
            classes.add(course);

            for (Node n : nodes.get(course).under) {
                n.decrementDegree();
                if (n.getDegree() == 0) {
                    stack.push(n.getVal());
                }
            }
        }

        if (classes.size() != numCourses) {
            return new int[0]; // return an empty array if there's a cycle
        }

        // Convert ArrayList to int[]
        return classes.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        int[] output1 = findOrder(numCourses1, prerequisites1);
        System.out.println(Arrays.toString(output1));  // Expected: [1, 0]
        
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {0,2}};
        int[] output = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(output));  // Expected: [1, 0, 2]
        
        int numCoursesw = 3;
        int[][] prerequisitesw = {{1, 0}, {0,2}, {2,1}};
        int[] outputw = findOrder(numCoursesw, prerequisitesw);
        System.out.println(Arrays.toString(outputw));  // Expected: [] (empty array due to cycle)
    }
}
