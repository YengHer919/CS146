class TreeNode(object):

  def __init__(self, val=0, left=None, right=None):

    self.val = val

    self.left = left

    self.right = right


def lowestCommonAncestor(root: 'TreeNode | None', p: 'TreeNode',
                         q: 'TreeNode'):
  if root == None:
    return None
  if root == p or root == q:
    return root
  left = lowestCommonAncestor(root.left, p, q)
  right = lowestCommonAncestor(root.right, p, q)
  if left and right:
    return root
  return left if left else right


# Create leaf nodes
node1 = TreeNode(1)
node5 = TreeNode(5)

# Create node 2 and attach 1 as a child
node2 = TreeNode(2, node1, None)

# Create node 4 and attatch 5 as child
node4 = TreeNode(4, None, node5)

# Create the root node and attach 2 and 4 as children
root = TreeNode(3, node2, node4)

printNode1 = lowestCommonAncestor(root, node1, node5)
printNode2 = lowestCommonAncestor(root, node1, node2)
printNode3 = lowestCommonAncestor(root, node2, node4)
printNode4 = lowestCommonAncestor(root, root, node5)

if (printNode1 != None):
  print(printNode1.val)
if (printNode2 != None):
  print(printNode2.val)
if (printNode3 != None):
  print(printNode3.val)
if (printNode4 != None):
  print(printNode4.val)

print()
print("Testing the tree provided in the assignment")
print()

# Create leaf nodes
nodes1 = TreeNode(1)
nodes2 = TreeNode(2)
nodes5 = TreeNode(5)
nodes9 = TreeNode(9)

# Create nodes 2nd row
nodes3 = TreeNode(3, nodes1, nodes2)
nodes8 = TreeNode(8, nodes5, nodes9)

# Create node 4 and attatch 5 as child
roots4 = TreeNode(4, nodes3, nodes8)

printNodes1 = lowestCommonAncestor(roots4, nodes3, nodes1)
printNodes2 = lowestCommonAncestor(roots4, nodes1, nodes5)
printNodes3 = lowestCommonAncestor(roots4, nodes2, nodes3)
printNodes4 = lowestCommonAncestor(roots4, nodes8, nodes5)

if (printNodes1 != None):
  print(printNodes1.val)
if (printNodes2 != None):
  print(printNodes2.val)
if (printNodes3 != None):
  print(printNodes3.val)
if (printNodes4 != None):
  print(printNodes4.val)
