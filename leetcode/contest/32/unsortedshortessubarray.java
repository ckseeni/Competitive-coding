Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:

Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending o

/*The idea behind this method is that the correct position of the minimum element in the unsorted subarray helps to determine the required left boundary. Similarly, the correct position of the maximum element in the unsorted subarray helps to determine the required right boundary.

Thus, firstly we need to determine when the correctly sorted array goes wrong. We keep a track of this by observing rising slope starting from the beginning of the array. Whenever the slope falls, we know that the unsorted array has surely started. Thus, now we determine the minimum element found till the end of the array numsnumsnums, given by minminmin.

Similarly, we scan the array numsnumsnums in the reverse order and when the slope becomes rising instead of falling, we start looking for the maximum element till we reach the beginning of the array, given by maxmaxmax.

Then, we traverse over numsnumsnums and determine the correct position of minminmin and maxmaxmax by comparing these elements with the other array elements. e.g. To determine the correct position of minminmin, we know the initial portion of numsnumsnums is already sorted. Thus, we need to find the first element which is just larger than minminmin. Similarly, for maxmaxmax's position, we need to find the first element which is just smaller than maxmaxmax searching in numsnumsnums backwards.*/
