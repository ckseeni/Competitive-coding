
Count frequencies of all elements in array in O(1) extra space and O(n) time

Given an unsorted array of n integers which can contain integers from 1 to n. Some elements can be repeated multiple times and some other elements can be absent from the array. Count frequency of all elements that are present and print the missing elements.

Examples:

Input: arr[] = {2, 3, 3, 2, 5}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 2
        3 -> 2
        4 -> 0
        5 -> 1

Input: arr[] = {4, 4, 4, 4}
Output: Below are frequencies of all elements
        1 -> 0
        2 -> 0
        3 -> 0
        4 -> 4

We strongly recommend that you click here and practice it, before moving on to the solution.

A Simple Solution is to create a count array of size n as the elements are in range from 1 to n. This solution works in O(n) time, but requires O(n) extra space.

How to do it in O(1) extra space and O(n) time?

Below are two methods to solve this in O(n) time and O(1) extra space. Both method modify given array to achieve O(1) extra space.

Method 1 (By making elements negative)
The idea is to traverse the given array, use elements as index and store their counts at the index. For example, when we see element 7, we go to index 6 and store the count. There are few problems to handle, one is the counts can get mixed with the elements, this is handled by storing the counts as negative. Other problem is loosing the element which is replaced by count, this is handled by first storing the element to be replaced at current index.



How does above program work?
Let us take below example to see step by step processing of
above program:
arr[] = {2, 3, 3, 2, 5}

i = 0, arr[i] = 2, arr[] = {2, 3, 3, 2, 5}
Since arr[i] > 0, find elementIndex.
elementIndex = arr[i] – 1 = 2 – 1 = 1,
arr[elementIndex] or arr[1] is 3
Since arr[elementIndex] is postive,
arr[i] = arr[elementIndex] = 3
arr[elementIndex] = -1 // 2 is seen 1 times so far
i is not changed.

i = 0, arr[i] = 3, arr[] = {3, -1, 3, 2, 5}
Since arr[i] > 0, find elementIndex.
elementIndex = arr[i] – 1 = 3 – 1 = 2
arr[elementIndex] or arr[2] is 3
Since arr[elementIndex] is postive
arr[i] = arr[elementIndex] = 3
arr[elementIndex] = -1 // 3 is seen 1 times so far
i is not changed.

i = 0, arr[i] = 3, arr[] = {3, -1, -1, 2, 5}
Since arr[i] > 0, find elementIndex.
elementIndex = arr[i] – 1 = 3 – 1 = 2
arr[elementIndex] or arr[2] is -1
Since arr[elementIndex] is negative
arr[elementIndex] = arr[elementIndex] – 1
= -2 // 3 is seen 2 times so far
arr[i] = 0 // 1 is not seen so far
i is incremented

i = 1, arr[i] = -1, arr[] = {0, -1, -2, 2, 5}
Since arr[i] is negative, increment i

i = 2, arr[i] = -2, arr[] = {0, -1, -2, 2, 5}
Since arr[i] is negative, increment i

i = 3, arr[i] = 2, arr[] = {0, -1, -2, 2, 5}
Since arr[i] > 0, we find elementIndex.
elementIndex = arr[i] – 1 = 2 – 1 = 1
arr[elementIndex] or arr[1] is -1
Since arr[elementIndex] is negative
arr[elementIndex] = arr[elementIndex] – 1
= -2 // 2 is seen 2 times so far
arr[i] = 0 // 4 is not seen so far
i is incremented

i = 4, arr[i] = 5, arr[] = {0, -2, -2, 0, 5}
Since arr[i] > 0, we find elementIndex.
elementIndex = arr[i] – 1 = 5 – 1 = 4
arr[elementIndex] or arr[4] is 5
Since arr[elementIndex] is postive
arr[i] = arr[elementIndex] = 4
arr[elementIndex] = -1 // 5 is seen 1 times so far
i is not changed.

i = 1, arr[i] = -1, arr[] = {0, -2, -2, 0, -1}
Since arr[i] is negative, increment i



