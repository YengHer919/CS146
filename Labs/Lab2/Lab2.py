s = "friedii"
t = "firedii"
anagram = {}
anagrams = {}

if len(s) == len(t):
  for char in s:
    if char in anagram:
      anagram[char] += 1
    else:
      anagram[char] = 1

  for char in t:
    if char in anagrams:
      anagrams[char] += 1
    else:
      anagrams[char] = 1

  if (anagram == anagrams):
    print(str(s) + " and " + str(t) + " are anagrams.")
  else:
    print(str(s) + " and " + str(t) + " are not anagrams.")
else:
  print(str(s) + " and " + str(t) + " are not equal length.")
