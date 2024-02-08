n = 10
start1 = 0
start2 = 1

for i in range(n):
  if(i == 0):
    print("The " + str(i+1) + "th Fibonacci number is " + str(start1))
  elif(i == 1):
    print("The " + str(i+1) + "th Fibonacci number is " + str(start2))
  else:
    start3 = start1 + start2
    start1 = start2
    start2 = start3
    print("The " + str(i+1) + "th Fibonacci number is " + str(start3))