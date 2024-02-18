# Yeng Her
# 1.30.24
# Two sum

from typing import List


def threeSum(nums: List[int]) -> List[List[int]]:
  #inialize lists and a target
  result = []
  target = 0
  seen = []

  for i in range(len(nums)):
    #make a new hashmap for each iteration
    hasbrown = {}
    #sets a traget based off of current number in list
    difference = target - nums[i]

    for j in range(i, len(nums)):
      #if the difference is in the hashmap, add the current number and the difference to the result list
      num = difference - nums[j]

      #checks for repeat numbers
      if num in hasbrown and nums[i] != nums[j] and nums[j] != num and nums[
          i] != num:
        triple = [nums[i], nums[j], num]
        triple = sorted(triple)
        #checks for repeat triplets
        if triple not in seen:
          result.append(triple)
          seen.append(triple)
      hasbrown[nums[j]] = j

  if len(result) == 0:
    print(result)
    #print("There are no triplets in the set that equal zero")
    return result

  print(result)
  return result


nums = [0, 1, 1]
# Output: []
# Explanation: The only possible triplet does not sum up to 0.

num = [-5, 0, 5, 10, -10, 0]
# Output: [[-10,0,10],[-5,0,5]]
# Explanation: There are two possible combinations of triplets that satisfy: (-5,0,5) and (-10,0,10).

threeSum(nums)
threeSum(num)
