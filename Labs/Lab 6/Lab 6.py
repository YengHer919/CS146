def can_finish(num_courses, prerequisites):
  graph = {}

  for prerequisite in prerequisites:
      to, from_ = prerequisite
      if to not in graph:
          graph[to] = []
      graph[to].append(from_)

  visited = [False] * num_courses
  for i in range(num_courses):
      if not visited[i] and has_cycle(graph, i, visited):
          return False

  return True

def has_cycle(graph, i, visited):
  if visited[i]:
      return True
  visited[i] = True

  neighbors = graph.get(i, [])
  if not neighbors:
      graph[i] = []
  for neighbor in neighbors:
      if has_cycle(graph, neighbor, visited):
          return True

  visited[i] = False
  return False

# Test cases
num_courses = 2
prerequisites = [[1, 0], [0, 1]]
print(can_finish(num_courses, prerequisites)) 

num_courses = 2
prerequisites = [[1, 0]]
print(can_finish(num_courses, prerequisites))
