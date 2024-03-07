class TreeNode:

  def __init__(self, val=0, left=None, right=None):
    self.val = val
    self.left = left
    self.right = right


def invert(currNode):
  if currNode is not None and currNode.left is not None and currNode.right is not None:
    tempNode = currNode.right
    currNode.right = currNode.left
    currNode.left = tempNode
    invert(currNode.left)
    invert(currNode.right)


def main():
  node3 = TreeNode(3)
  node4 = TreeNode(4)
  node5 = TreeNode(5)
  node6 = TreeNode(6)
  node2 = TreeNode(2, node3, node4)
  node8 = TreeNode(8, node5, node6)
  root = TreeNode(1, node2, node8)

  if (root != None and root.left != None and root.right != None):
    print(root.val)
    print(root.left.val)
    print(root.left.left.val)
    print(root.left.right.val)
    print(root.right.val)
    print(root.right.right.val)
    print(root.right.left.val)
    print()

    invert(root)

    print(root.val)
    print(root.left.val)
    print(root.left.left.val)
    print(root.left.right.val)
    print(root.right.val)
    print(root.right.right.val)
    print(root.right.left.val)


if __name__ == "__main__":
  main()
