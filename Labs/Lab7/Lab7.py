import sys


def find_the_city(n, edges, distance_threshold):
  dist = [[sys.maxsize // 2] * n for _ in range(n)]

  for i in range(n):
    dist[i][i] = 0

  for edge in edges:
    from_, to, weight = edge
    dist[from_][to] = weight
    dist[to][from_] = weight

  for k in range(n):
    for i in range(n):
      for j in range(n):
        if dist[i][k] != sys.maxsize // 2 and dist[k][j] != sys.maxsize // 2:
          dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

  min_cities = sys.maxsize
  min_city = -1

  for i in range(n):
    reachable_cities = sum(1 for j in range(n)
                           if dist[i][j] <= distance_threshold)
    if reachable_cities <= min_cities:
      min_cities = reachable_cities
      min_city = i

  return min_city


if __name__ == "__main__":
  edges = [[0, 1, 3], [1, 2, 1], [1, 3, 4], [2, 3, 1]]
  n = 4
  distance_threshold = 1
  print(find_the_city(n, edges, distance_threshold))  # Output: 0
  print(find_the_city(n, edges, 4))  # Output: 3

  edges = [[0, 1, 2], [0, 4, 8], [1, 2, 3], [1, 4, 2], [2, 3, 1], [3, 4, 1]]
  n = 5
  distance_threshold = 2
  print(find_the_city(n, edges, distance_threshold))  # Output: 0
