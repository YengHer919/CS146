from collections import deque
from typing import Optional
from typing import List


class TreeNode(object):

  def __init__(self, val=0, left=None, right=None):

    self.val = val

    self.left = left

    self.right = right


def levelOrder(root: Optional[TreeNode]) -> List[List[int]]:
  result = []
  if root is None:
    return result

  queue = deque()
  queue.append(root)

  while queue:
    level_size = len(queue)
    level_nodes = []

    for _ in range(level_size):
      node = queue.popleft()
      level_nodes.append(node.val)

      if node.left:
        queue.append(node.left)
      if node.right:
        queue.append(node.right)

    result.append(level_nodes)

  return result


node1 = TreeNode(1)
node5 = TreeNode(5)
node9 = TreeNode(9)
node3 = TreeNode(3, node1)
node8 = TreeNode(8, node5, node9)
root = TreeNode(4, node3, node8)

print(levelOrder(root))
