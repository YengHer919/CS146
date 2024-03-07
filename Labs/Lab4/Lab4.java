
public class Lab4 {
	public static void invert(TreeNode currNode){
		if(currNode != null && currNode.left != null && currNode.right != null){
			TreeNode tempNode = currNode.right;
			currNode.right = currNode.left;
			currNode.left = tempNode;
			invert(currNode.left);
			invert(currNode.right);
		}
	}
	
		public static void main(String[] args) {
			TreeNode node3 = new TreeNode(3);
			TreeNode node4 = new TreeNode(4);
			TreeNode node5 = new TreeNode(5);
			TreeNode node6 = new TreeNode(6);
			TreeNode node2 = new TreeNode(2, node3, node4);
			TreeNode node8 = new TreeNode(8, node5, node6);
			TreeNode root = new TreeNode(1, node2, node8);
			System.out.println(root.val);
			System.out.println(root.left.val);
			System.out.println(root.left.left.val);
			System.out.println(root.left.right.val);
			System.out.println(root.right.val);
			System.out.println(root.right.right.val);
			System.out.println(root.right.left.val);
			System.out.println();
			invert(root);
			System.out.println(root.val);
			System.out.println(root.left.val);
			System.out.println(root.left.left.val);
			System.out.println(root.left.right.val);
			System.out.println(root.right.val);
			System.out.println(root.right.right.val);
			System.out.println(root.right.left.val);
		}
}


