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
