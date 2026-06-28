class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length+1;
        int xor1=0;
        int xor2=0;
        for(int i=0;i<n-1;i++){
            xor2^=nums[i];

        }
        for(int i=0;i<n-1;i++){
            xor1^=(i+1);

        }
        return xor1^xor2;
    }
}