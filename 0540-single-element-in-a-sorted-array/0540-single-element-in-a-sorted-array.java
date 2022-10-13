// Solution 1 - The equal number exists in pair, means at starting the value of first occurance (0,2,4,6,8...) [Even positions] 
// is equal to (1,3,5..)  [Odd positions] but if any single value appears then  
// positions of (1,3,5..)  [Odd positions] will be first occurance
// So by following this logic we do the binary search.

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int h = nums.length-1;
         while(l<h)
         {
             int mid = l + (h-l)/2;
             if((mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid%2 != 0 && nums[mid] == nums[mid-1]))
                 l = mid+1;
             else
                 h = mid;
         }
        
        return nums[l];
    }
}