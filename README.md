# CS146 Lab 1
So first I tried the brute force method just to get an idea of what I needed to do
I then drew what the brute force method looked like, then I recalled some of the topics,
and ideas covered in class and I decided to try using a hashmap, essentially redoing
the brute force method. At first, I didn't see how it was much different, but after 
doing some research I found that even though the hashmap version was very similar
to the brute force method, it was a lot more efficient because of how search is in
hashmaps. 

How I approached the method of hashmapping was first subtracting the current element
in the array from the target. This would be the difference or the complementary
number that I would look for in the hashmap. If the hashmap did not contain that 
number, I would insert the current element into the hashmap for later reference.
Then I would repeat this method for the rest of the array. This would make sure
that I went through as many elements as I needed to get my result. There is a 
backup message at the end in the case that there were no two numbers to add
up to that sum. 

I first did it in Java then converted to Python, as Java is my strong suit as 
of now due to constant practice. I simply searched up the syntaxes for python and
manually made the switch.



# CS146 HW 1
I overcomplicated things on the Java. I did not know that methods of editing and 
replacing characters within strings was an option. I only found this out after completing
the python that these methods exsisted for Java. I did Java first, as I am more profficeint
with it, however, from here I will be using python first. My general thought process
was to make lists to store the characters of the string. First, the string would go
through a loop for each character it had, if the character was non-alphabetical, the inner
if-statement would skip. If it was, the if statement would add the char to the begginging
of one list and the end of the other. This would give me two lists of lowercase characters
one reversed and one regular both without spaces (or any other characters that weren't in the
alphabet). I would then concatenate both lists and turn them into strings, then I would compare 
them. I encountered a problem when dealing with spaces, however, as the spaces caused gaps or empty
or null elements within the lists that messed up the string comprison. I fixed that by first getting 
the lower case lists, then taking out the spaces while creating the string. This made sure that 
even if there were multiple spaces, it wouldn't mess the order of the elements up. When I finished
the Java version, I translated my work to Python.


# CS146 Lab 2
I found the logic of this lab somewhat similar to HW1. For both Java and Python I made a for loop.
It was for every character, add to hashmap/dictionary. If character already exsists in hashmap/dictionary,
increment. Then I compared both haspmaps/dictionaries and added the necessary if/else and print statements


# CS146 HW 2
For this homework, I noticed that I needed a search algorithm. I simply implemented binary search but instead
of searching if the number was greater than or less than middle, I was searching to see if middle was a bad
version. If middle wasn't bad, that meant that the versions after it were bad. If it was bad, that meant that 
there was a bad version before it, or that it was the bad version. Either way, I would half the list everytime
the loop iterated, making less searches to the API than if I were to brute force it


# CS146 Extra Credit
I first had to rememeber how the fibannacci seqeunce worked. After remembering the sequence
and basic behavior, I started with four variables. All but one initialized with zeros, the
outlier was an arbitrary number. I then tried some algebra with a for loop and some if 
statements, but I could only ever get the 0 1 1 part correct. After some tweaking I only
got 0 1 2 3 5... onwards. I accomplished this by storing two zeros and a one within the variables
I then added two variables and stored them within the outlier. I then swapped the values of the
variables with each other. The one that stored the sum stayed the same, the one that was 
less than got updated to the previous greater than number, and the greater than variable
was updated with the sum. If the program ended, the greater variable would be printed, if not
then it would be used to increment the next sum variable. After a couple attempts of getting 
the beginning 0 1 1, I quit and searched it up. With a simple if statement in the beginning I
got everything to turn out good.


# CS146 HW 5
For this homework I compared the elements of the runtimes to the masters theorem and 
replaced the vairbales within the formula to produce my answers. For part 2, I went 
line by line and analyzed how many times each line would be run, then I made it a 
reccurrence relation and found its upper, middle, and lower bounds.


# CS146 HW 5
We did this lab in class, by applying log principles to the problems, we can break
them down and make them easier to comapre. For some, it was just intuition. (ex: 2^2n vs 2^n). 
For part 2, I went line by line and analyzed how many times each line would be run,
then I made it a reccurrence relation and found its upper, middle, and lower bounds.
