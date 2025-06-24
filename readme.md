This Repo Contain the all the problem which I solved and add inline commands

Week 1:
---------

    Week1 problem contains basic and easy with couple of medium math problem
    * For prime number does not visited n time instead visit up to sqrt(n).
    * Count Number of prime number for n Element, use Sieve of Eratosthenes with time complexity of O(log n logn)
    * Multiply String do mutliplication from end and add them array and final concat the array to get the result.

---
Week 2:
-------

### Searching

    Week2 includes solving problems with patterns like searching, sorting and a little bit of Sliding window
       1. Finding first and last position of the given target,
            This problem includes basic binary search and to find first position use target
            and last position use target + 1 if both are not equal return them left and right -1, or else return {-1, -1}
       2. Find Minimum Sorted Rotated Array (similar Search In Sorted Rotated).
            The key approach for this problem find the mid and compare the mid with right,
            if mid is greater than minimum is present in right or else it presents in left side
            nums[mid] > nums[right] left = mid + 1 or right = mid + 1.
       3. Find Minimum sorted Rotated Array with Duplicate (similar Search In Sorted Rotated  2) .
            This is an extended version of the above problem, same approach till find mid,
            if mid is greater than right left = mid + 1. nums[mid] > nums[right]  left = mid + 1
            else if mid is less than right = mid. nums[mid] < nums[right] right = mid;
            else goes if mid and right are equal in case we are going to shrink the array from the side. nums[mid] == nums[right] right--;
       4. Find Peak Elements.
            This problem is states the element in left and right are should smaller current element,
            if index 0 or n -1, left side of 0 is -1 and right side of n - 1 is n which is outbound of the array in thi case it consider
            as INF
            if num[mid] < nums[mid+ 1] left = mid + 1
            else right = mid;
       5. Find Kth Largest Element Array.
            This approach for this problem is slightly different, because we need to find the lower and upper bound.
            lower bound will be the smallest element
            upper bound will be the largest element
            find mid, write a function to count number element greater than mid and return
            if count greater than equal to k right = mid
            else left = mid + 1
       6. Find Kth Smallest in Sorted Matrix.
            This approach for this problem is same as above problem,
            lower bound will be first element in the matrix
            upper bound will be last element in the matrix
            find mid, write a function to count number less than equal to mid below is code snippet
            /* if(matrix[row][col] <= mid) {
            // important thing to remember
            count += (row + 1);
            col++;
            } else row--; */
       7. Find Single Element in Sorted Array
            This problem falls under normal binary search
            important point to notes is we need to called midOffset which is depends on mid,
            if mid is even mid + 1 or mid -1;
            if mid and mid offset are not equal right = mid // this state that the single element is present in left
            else left = mid + 1  the element is present in right
       8. Inversion Count
            This problem fall under the sorting technique it solved using mergesort while
            calling the merge if left element is greater than right the count happen (left.length - i)
       9. SearchIn2DMatrix
            This problem falls under the Searching technique, for each need to binary search
       10. Next Permutation
            This is very interesting problem and falls under greedy with two pointer technique
            first find the dip using loop from index-2  breakpoint and break out of the loop
            if the breakpoint is same as initial value reverse the array and return
            find the second element less than breakpoint and swap then break loop
            final reverse arr from  breakpoint + 1 to end.
       11. Aggression cow 
            This one of the binary search problem, in this problem find lower and upper bound of the array is diffcult
            before that sort the array lower possible minimum difference is 1 (8, 9) (12, 13) and upper bound is take the 
            lastElement - firstElement.
            int mid value , if the difference between two stall is greater than equal to mid add count, need to place given
            number of cow.
            need to shift lower and upper bound accordingly.
       12. K MutliplicationTable
            This is also fall under BS, in this problem lower and upper identification is easy
            lower is 1 and upper will be n * m
            find the mid and n is row and m is col in my case count the element using formula
            count += Math.min(mid / 1 ... to n, m)
            if mid is 5 but n is 3 so total col will like (1,2,3) (2,4,6) so taking count give appropriate
            count and shift upper and lower bound accordingly
       13. SegregationEvenOdd
            initial new array with as input array
            then first itr only even number and then iterate again to insert odd number
            then copy array to original input array.
        

---
Week3
-------
Need to do.

---
Week4
-------
Need to do.

-----

Week5
---

### SlidingWindow

    1. The key take for Sliding window approach is using two pointer left, right 
    the right is always moving once give condition is met, the window size will
    start shrink by moving the left pointer.
    (right - left + 1) is key problem 
    
    2. The second the number of subArray, in sliding window it very hard track size
    we need to use atMost function, the sliding window logical goes inside this function
    the calculation happens using differnce of k and k - 1

    



