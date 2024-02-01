# Yeng Her
# 1.30.24
# Two sum


def two_sum(array, target):
  # initialize dictionary (equivalent to Java's HashMap)
  hashbrown = {}

  # loop through the array, store items in the dictionary, then search the dictionary for the difference
  # if the difference is not found, store it in the dictionary and continue adding and searching
  for i in range(len(array)):
    difference = target - array[i]
    if difference in hashbrown:
      return "The two numbers from the list that equal " + str(
          target) + " are in locations " + str(
              hashbrown[difference]) + " and " + str(i)

    hashbrown[array[i]] = i

  return "No two numbers in the list add up to " + str(target)


# initialize array and target
array = list(range(10))
target = 17

print(two_sum(array, target))
