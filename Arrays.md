# Arrays

### Find Unique ==Easy==

```
https://www.codingninjas.com/codestudio/problems/find-unique_625159
Q. You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once. You need to find and return that number which is unique in the array/list.

Example:
    Input: 7
           2 3 1 6 3 6 2
    Output: 1
```

> Using XOR operator : a ^ a = 0, a ^ 0 = a, 1 ^ 1 = 0, 0 ^ 1 = 1, 0 ^ 0 = 0

```cpp
int findUnique(int *arr, int size)
{
    int ans = 0;
    for (int i = 0; i< size; i++){
        ans = ans ^ arr[i];
    }
    return ans;
}
```

### Longest Sub-Array with Sum K

```
https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
Q. Given an array containing N integers and an integer K., Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value K.

Example:
    Input :
        A[] = {10, 5, 2, 7, 1, 9}
        K = 15
    Output : 4
    Explanation: The sub-array is {5, 2, 7, 1}.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(N).
```

### Longest Subarray with equal 0s and 1s

### Find pair with having sum X in unsorted array

### Reverse an array

### Rotate an array by number by D

### Replace Elements with Greatest Element on Right Side

### Prefix Sum array

### Find Pivot Index or Equilibrium Point

### Maximum occurred integer in N ranges

### Strongest Neighbour | Find Peak Element

### First Missing Positive

### Rearrange array alternatively

### Rearrange the array

### Maximum Index

### Check if array is sorted and rotated

### Trapping Rainwater

### Best Time to Buy and Sell Stock

### Best Time to Buy and Sell Stock II

### Best Time to Buy and Sell Stock III

### Sub array Sum Equals K

### Minimum Size Sub array Sum

### Sum of Sub array Minimums

### Maximum Subarray | Kadane Algorithm

### Sliding Window Maximum

### Maximum Gap

### Contains Duplicate

### Two Sum

### Merge Sorted Array

### Intersection of Two Arrays II

### Best Time to Buy and Sell Stock

### Binary Search

### Search Insert Position

### Squares of a Sorted Array

### Move Zeroes

### Two Sum II - Input Array Is Sorted

### Left most index of an element

### Count of occurrences of x in sorted element

### Count of 1s in binary sorted array

### Peak element

### Find an element in infinite sized sorted array

### Square root of an integer

### Find pair in unsorted array which gives sum X

### Find pair in sorted array which gives sum X

### Find triplet in an array which gives sum X
