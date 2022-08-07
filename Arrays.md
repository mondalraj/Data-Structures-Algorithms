# Arrays

## Find Unique `Easy`

https://www.codingninjas.com/codestudio/problems/find-unique_625159

```
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

## Unique Number of Occurrences `Easy`

https://leetcode.com/problems/unique-number-of-occurrences/

```
Q. Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.

Example:
    Input: arr = [1, 2, 2, 1, 1, 3]
    Output: true
    Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
```

> Using unordered_map : Storing frequencies of occurences
> Using unordered_set : For finding the duplicate frequencies

```cpp
class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        unordered_map<int, int> map;
        unordered_set<int> occurrences;
        for(auto i = arr.begin(); i!=arr.end(); i++){
            auto it = map.find(*i);
            if(it != map.end()){
                (*it).second += 1;
            } else {
                map.insert(make_pair(*i, 1));
            }
        }
        for (auto x : map){
            // Storing values(occurrences) in hashset -> removes duplicates
            occurrences.insert(x.second);
        }
        if(map.size() == occurrences.size()){
            return true;
        }else {
            return false;
        }
    }
};
```

> Similar Question:

### Find Duplicates in Array

https://www.codingninjas.com/codestudio/problems/duplicate-in-array_893397

```
Q. You are given an array ‘ARR’ of size ‘N’ containing each number between 1 and ‘N’ - 1 at least once. There is a single integer value that is present in the array twice. Your task is to find the duplicate integer value present in the array.

Example: Consider ARR = [1, 2, 3, 4, 4], the duplicate integer value present in the array is 4. Hence, the answer is 4 in this case.
```

Approach 1 - Solve using hashset (insert into set if not present in the set, else return the element which is already present)

Approach 2 - Using Bitwise XOR (But can only be use if there is only 1 duplicate element)
arr ^ arr[1 : N-1] = X (Duplicate Element) :- a ^ a = 0, a ^ 0 = a

```cpp
int findDuplicate(vector<int> &arr)
{
    int ans = 0;
    for (int i=0; i<arr.size(); i++){
        ans = ans ^ arr[i];
    }
    for (int i=1; i< arr.size(); i++){
        ans = ans ^ i;
    }
	return ans;
}
```

## Intersection Of Two Sorted Arrays `Easy`

https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149

```
Q. You are given two arrays 'A' and 'B' of size 'N' and 'M' respectively. Both these arrays are sorted in non-decreasing order. You have to find the intersection of these two arrays.
Example :
    Input : 6 4
            1 2 2 2 3 4
            2 2 3 3
    Output : 2 2 3

Expected Time Complexity : O(max (M, N))
```

> Using two pointers approach

```cpp
vector<int> findArrayIntersection(vector<int> &arr1, int n, vector<int> &arr2, int m)
{
	vector<int> ans;
    int i = 0, j = 0;
    while(i< n && j< m){
        if(arr1[i] == arr2[j]){
            ans.push_back(arr1[i]);
            i++;
            j++;
        }else if(arr1[i] < arr2[j]){
            i++;
        }else{
            j++;
        }
    }
    return ans;
}
```

## Longest Sub-Array with Sum K

https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1

```
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

## Longest Subarray with equal 0s and 1s

## Find pair with having sum X in unsorted array

## Reverse an array

## Rotate an array by number by D

## Replace Elements with Greatest Element on Right Side

## Prefix Sum array

## Find Pivot Index or Equilibrium Point

## Maximum occurred integer in N ranges

## Strongest Neighbour | Find Peak Element

## First Missing Positive

## Rearrange array alternatively

## Rearrange the array

## Maximum Index

## Check if array is sorted and rotated

## Trapping Rainwater

## Best Time to Buy and Sell Stock

## Best Time to Buy and Sell Stock II

## Best Time to Buy and Sell Stock III

## Sub array Sum Equals K

## Minimum Size Sub array Sum

## Sum of Sub array Minimums

## Maximum Subarray | Kadane Algorithm

## Sliding Window Maximum

## Maximum Gap

## Contains Duplicate

## Two Sum

## Merge Sorted Array

## Intersection of Two Arrays II

## Best Time to Buy and Sell Stock

## Binary Search

## Search Insert Position

## Squares of a Sorted Array

## Move Zeroes

## Two Sum II - Input Array Is Sorted

## Left most index of an element

## Count of occurrences of x in sorted element

## Count of 1s in binary sorted array

## Peak element

## Find an element in infinite sized sorted array

## Square root of an integer

## Find pair in unsorted array which gives sum X

## Find pair in sorted array which gives sum X

## Find triplet in an array which gives sum X
