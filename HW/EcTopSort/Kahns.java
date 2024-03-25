import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Kahns {
    public static class node {
        ArrayList<Integer> prereq = new ArrayList<>();
        ArrayList<node> under = new ArrayList<>();
        int inDegree = 0;
        int val;
        
        public node(int i) {
        	val = i;
        }
        
        public int getVal() {
        	return val;
        }
        
        public void addPrereq(int n) {
            prereq.add(n);
        }
        
        public void addUnder(node n) {
        	under.add(n);
        }
        
        public void addDegree() {
			inDegree++;
		}
		
		public void subDegree() {
			if(inDegree > 0) {
				inDegree--;
			}
		}
		
		public int getDegree() {
			return inDegree;
		}
        
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<node> nodes = new ArrayList<>();
        ArrayList<Integer> classes = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            nodes.add(new node(i));
        }

        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int pre = prereq[1];
            nodes.get(course).addPrereq(pre);
            nodes.get(course).addDegree();
            nodes.get(pre).addUnder(nodes.get(course));
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (nodes.get(i).getDegree() == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int course = q.poll();
            classes.add(course);

            for (node n: nodes.get(course).under) {
                n.subDegree();
                if (n.getDegree() == 0) {
                    q.offer(n.getVal());
                }
            }
        }

        if (classes.size() != numCourses) {
            return new int[0]; // return an empty array if there's a cycle
        }

        int[] result = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            result[i] = classes.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1, 0}};
        int[] output1 = findOrder(numCourses1, prerequisites1);
        System.out.println(Arrays.toString(output1));  // Expected: [1, 0]
        
        int numCourses = 3;
        int[][] prerequisites = {{1, 0}, {0,2}};
        int[] output = findOrder(numCourses, prerequisites);
        System.out.println(Arrays.toString(output));  
        
        int numCoursesw = 3;
        int[][] prerequisitesw = {{1, 0}, {0,2}, {2,1}};
        int[] outputw = findOrder(numCoursesw, prerequisitesw);
        System.out.println(Arrays.toString(outputw)); 
    }
}
