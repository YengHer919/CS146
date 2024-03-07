class TreeNode:
  def __init__(self, val=0, left=None, right=None):
      self.val = val
      self.left = left
      self.right = right

def verify(root):
  return verify_helper(root, float('-inf'), float('inf'))

def verify_helper(curr_node, lower_bound, upper_bound):
  if curr_node is None:
      return True
  if not lower_bound < curr_node.val < upper_bound:
      return False
  return (verify_helper(curr_node.left, lower_bound, curr_node.val) and
          verify_helper(curr_node.right, curr_node.val, upper_bound))

# Example usage
if __name__ == "__main__":
  node3 = TreeNode(3)
  node4 = TreeNode(4)
  node5 = TreeNode(5)
  node6 = TreeNode(6)
  node2 = TreeNode(2, node3, node4)
  node8 = TreeNode(8, node5, node6)
  root = TreeNode(1, node2, node8)
  print(verify(root))

  nodes1 = TreeNode(1)
  nodes3 = TreeNode(3)
  nodes6 = TreeNode(6)
  nodes8 = TreeNode(8)
  nodes2 = TreeNode(2, nodes1, nodes3)
  nodes7 = TreeNode(7, nodes6, nodes8)
  roots = TreeNode(5, nodes2, nodes7)
  print(verify(roots))
