class Solution {
    public int[] sortedSquares(int[] nums) {
     int[] result=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for(int pos=nums.length-1;pos>=0;pos--){
            if(nums[left]*nums[left]>nums[right]*nums[right]){
                result[pos]=nums[left]*nums[left];
                left++;
            }
            else{
               result[pos]=nums[right]*nums[right]; 
               right--;
            }
        }
        return result;
    }
}