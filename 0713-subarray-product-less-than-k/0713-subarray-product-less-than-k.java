class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<=1) return 0;
        int n=arr.length;
        int product=1;
        int low=0;
        int count=0;
        for(int high=0;high<n;high++){
            product*=arr[high];
            while(product>=k){
               
                product=product/arr[low];
                low++;
            }
         count+=high-low+1;
        }
        return count;
    }
}