#Yeng Her
#2/21/2024
#Finds the longest palindrome possible with string


def longestPalindrome(s):
  length = 0
  largestOdd = ''
  max = 0
  hashbrown = {}
  for i in s:
    if i in hashbrown:
      hashbrown[i] += 1
    else:
      hashbrown[i] = 1
  #print(hashbrown)

  for i in hashbrown:
    if (hashbrown[i] % 2 != 0 and hashbrown[i] > max):
      largestOdd = i
      max = hashbrown[i]
      length = max
      # print(largestOdd)
      # print(max)

  for i in hashbrown:
    if (hashbrown[i] % 2 == 0):
      length += hashbrown[i]

  # Code to print the palindrome
  # palindrome = []
  # for i in range(max):
  #   palindrome.append(largestOdd)

  # for i in hashbrown:
  #   if (hashbrown[i] % 2 == 0):
  #     for j in range(int(hashbrown[i] / 2)):
  #       palindrome.append(i)
  #       palindrome.insert(0, i)

  # string = ""
  # for i in palindrome:
  #   string += i
  # print(string)

  print(length)


longestPalindrome("abbbccccdd")
