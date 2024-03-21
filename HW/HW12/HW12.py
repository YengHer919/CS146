def min_cost_to_supply_water(n, wells, pipes):
  map = [[0] * n for _ in range(n)]
  cost = 0
  visit = [False] * n

  for pipe in pipes:
    from_, to, cost_ = pipe[0] - 1, pipe[1] - 1, pipe[2]
    map[from_][to] = cost_
    map[to][from_] = cost_

  while True:
    min_edge = float('inf')
    next_index = -1

    for i in range(n):
      if not visit[i]:
        for j in range(n):
          if visit[j] and map[i][j] != 0 and map[i][j] < min_edge:
            min_edge = map[i][j]
            next_index = i

        if wells[i] < min_edge and not visit[i]:
          min_edge = wells[i]
          next_index = i

    if next_index == -1:
      break

    cost += min_edge
    visit[next_index] = True

  return cost


# Test cases
def main():
  # Test case 1
  n1 = 3
  wells1 = [1, 2, 2]
  pipes1 = [[1, 2, 1], [2, 3, 1], [1, 3, 2]]
  # Expected result: 3
  test_and_print_result(n1, wells1, pipes1)

  # Test case 2
  n2 = 4
  wells2 = [1, 2, 3, 4]
  pipes2 = [[1, 2, 1], [2, 3, 2], [3, 4, 3], [4, 1, 4]]
  # Expected result: 7
  test_and_print_result(n2, wells2, pipes2)

  # Test case 3
  n3 = 5
  wells3 = [5, 5, 5, 5, 5]
  pipes3 = [[1, 2, 3], [2, 3, 2], [3, 4, 4], [4, 5, 1], [5, 1, 2]]
  # Expected result: 13
  test_and_print_result(n3, wells3, pipes3)

  # Test case 4
  n4 = 4
  wells4 = [1, 2, 1, 3]
  pipes4 = [[1, 2, 5], [2, 3, 7], [3, 4, 9], [4, 1, 3]]
  # Expected result: 7
  test_and_print_result(n4, wells4, pipes4)

  # Test case 5
  n5 = 4
  wells5 = [2, 1, 2, 3]
  pipes5 = [[1, 2, 5], [2, 3, 2], [3, 4, 4], [4, 1, 3]]
  # Expected result: 8
  test_and_print_result(n5, wells5, pipes5)

  # Test case 6
  n6 = 6
  wells6 = [1, 2, 1, 3, 4, 2]
  pipes6 = [[1, 2, 5], [2, 3, 2], [3, 4, 4], [4, 5, 1], [5, 6, 3], [6, 1, 2]]
  # Expected result: 10
  test_and_print_result(n6, wells6, pipes6)


def test_and_print_result(n, wells, pipes):
  result = min_cost_to_supply_water(n, wells, pipes)
  print("Test case result:", result)


if __name__ == "__main__":
  main()
