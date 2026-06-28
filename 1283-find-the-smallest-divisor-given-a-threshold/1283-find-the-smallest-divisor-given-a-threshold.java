class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=sumbyDivisor(nums,mid);
            if(val<=threshold){
               
                  high=mid-1;
            }
            else{
               low=mid+1;
            }


        }
        return low;
        
    }
    public static int sumbyDivisor(int[] nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            // sum+=Math.ceil((double)nums[i]/divisor);
            sum+=((nums[i]+divisor-1)/divisor);
        }
        return sum;
    }
}