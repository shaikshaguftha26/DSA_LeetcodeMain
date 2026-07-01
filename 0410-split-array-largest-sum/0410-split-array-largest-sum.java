class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        for(int num:nums){
            low=Math.max(low,num);
            high+=num;
        }
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr,int k,int mid){
        int painters=1;
        int currentPaint=0;
        for(int i=0;i<arr.length;i++){
            if(currentPaint+arr[i]<=mid){
                currentPaint+=arr[i];
            }
            else{
                painters++;
                currentPaint=arr[i];
                if(painters>k){
                    return false;
                }
            }

        }
        return true;
    } 
}