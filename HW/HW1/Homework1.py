#Yeng Her
#HW1, Palindrome
#1/31/2024

s = "wAS iT a CaR oR A Cat I sAw"
lowerCase = s.lower()
noSpace = lowerCase.replace(" ", "")
reverse = noSpace[::-1]

if (reverse == noSpace):
  print(str(s) + " is a palindrome")
else:
  print(str(s) + " is not a palindrome")
