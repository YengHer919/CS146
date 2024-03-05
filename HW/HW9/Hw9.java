class Hw9 {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) {
			return null;
		}
		if (p == root || q == root) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if(left != null && right != null) {
			return root;
		}
		else if (left != null) {
			return left;
		} else {
			return right;
		}
	}
	
	public static void main(String[] args) {
		// Create leaf nodes
		TreeNode nodes1 = new TreeNode(1);
		TreeNode nodes2 = new TreeNode(2);
		TreeNode nodes5 = new TreeNode(5);
		TreeNode nodes9 = new TreeNode(9);

		// Create nodes 2nd row
		TreeNode nodes3 = new TreeNode(3, nodes1, nodes2);
		TreeNode nodes8 = new TreeNode(8, nodes5, nodes9);

		// Create node 4 and attach 5 as child
		TreeNode roots4 = new TreeNode(4, nodes3, nodes8);

		TreeNode printNodes1 = lowestCommonAncestor(roots4, nodes3, nodes1);
		TreeNode printNodes2 = lowestCommonAncestor(roots4, nodes1, nodes5);
		TreeNode printNodes3 = lowestCommonAncestor(roots4, nodes2, nodes3);
		TreeNode printNodes4 = lowestCommonAncestor(roots4, nodes8, nodes5);

		System.out.println(printNodes1.val);
		System.out.println(printNodes2.val);
		System.out.println(printNodes3.val);
		System.out.println(printNodes4.val);
	}
}


class TreeNode {

	int val;

	TreeNode left;

	TreeNode right;

	TreeNode() {}

	TreeNode(int val) { this.val = val; }

	TreeNode(int val, TreeNode left, TreeNode right) {

		this.val = val;

		this.left = left;

		this.right = right;

	}
}
