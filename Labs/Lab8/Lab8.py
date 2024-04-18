from typing import List


def coinChange(coins: List[int], amount: int) -> int:
  dp = [float('inf')] * (amount + 1)
  dp[0] = 0

  for coin in coins:
    for i in range(coin, amount + 1):
      dp[i] = min(dp[i], dp[i - coin] + 1)
  if dp[amount] == float('inf'):
    return -1
  else:
    return int(dp[amount])


coins = [1, 2, 5]
amount = 11
print(coinChange(coins, amount))
print(coinChange(coins, 6))
print(coinChange(coins, 3))
print(coinChange(coins, 16))
