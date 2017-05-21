int removeElement(int* nums, int numsSize, int val) {
    int begin = 0,i=0;
    for(i=0;i<numsSize;i++){
        if(nums[i]!=val){
            nums[begin] = nums[i];
            begin++;
        }
    }
    return begin;
}/*Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

Hint:

    Try two pointers.
    Did you use the property of "the order of elements can be changed"?
    What happens when the elements to remove are rare?

Subscribe to see which companies asked this question.
*/
