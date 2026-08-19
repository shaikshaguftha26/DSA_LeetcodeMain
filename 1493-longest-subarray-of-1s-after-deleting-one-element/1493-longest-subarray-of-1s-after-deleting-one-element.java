class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=0;
        int maxLen=0;
        int noOfZeroes=0;
    for(high=0;high<n;high++){
        if(nums[high]==0){
            noOfZeroes++;
        }
        while(noOfZeroes>1){
            if(nums[low]==0){
                noOfZeroes--;

            }
            low++;

        }
        int length=high-low;// no high-low+1 because we are deleting one element so high-low+1-1 which results to high-low
        maxLen=Math.max(length,maxLen);

    }
      return maxLen;  
    }
}