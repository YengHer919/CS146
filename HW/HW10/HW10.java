import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HW10 {
	public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelNodes = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                levelNodes.add(node.val);

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            result.add(levelNodes);
        }

        return result;
    }
    
	 public static void main(String[] args) {
		 TreeNode node1 = new TreeNode(1);
		 TreeNode node5 = new TreeNode(5);
		 TreeNode node9 = new TreeNode(9);
		 TreeNode node3 = new TreeNode(3, node1, null);
		 TreeNode node8 = new TreeNode(8, node5, node9);
		 TreeNode root = new TreeNode(4, node3, node8);
		 
		 System.out.println(levelOrder(root));
	 }
}
