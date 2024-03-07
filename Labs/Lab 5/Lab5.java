public class Lab5 {
	
	public static boolean verify(TreeNode root) {
		return verifyHelper(root, Integer.MIN_VALUE , Integer.MAX_VALUE);
	}

	private static boolean verifyHelper(TreeNode currNode, int lowerBound, int upperBound) {
		if (currNode == null) {
			return true;
		}
		if (currNode.val <= lowerBound || currNode.val >= upperBound) {
			return false;
		}
		if (!verifyHelper(currNode.left, lowerBound, currNode.val)) {
			return false;
		}
		if (!verifyHelper(currNode.right, currNode.val, upperBound)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node2 = new TreeNode(2, node3, node4);
		TreeNode node8 = new TreeNode(8, node5, node6);
		TreeNode root = new TreeNode(1, node2, node8);
		System.out.println(verify(root));

		TreeNode nodes1 = new TreeNode(1);
		TreeNode nodes3 = new TreeNode(3);
		TreeNode nodes6 = new TreeNode(6);
		TreeNode nodes8 = new TreeNode(8);
		TreeNode nodes2 = new TreeNode(2, nodes1, nodes3);
		TreeNode nodes7 = new TreeNode(7, nodes6, nodes8);
		TreeNode roots = new TreeNode(5, nodes2, nodes7);
		System.out.println(verify(roots));
	}
}


