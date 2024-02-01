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
