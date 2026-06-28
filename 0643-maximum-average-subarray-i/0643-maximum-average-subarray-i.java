class Solution {
    public double findMaxAverage(int[] arr, int k) {
       
        int sum=0;
       
       
    for(int i=0;i<=k-1;i++){
        sum+=arr[i];
      
    }
     int left=0;
      int maxSum=sum;
    for(int right =k;right<arr.length;right++){
        sum=sum-arr[left]+arr[right];
        left++;
         maxSum=Math.max(maxSum,sum);
         
    }
    return (double) maxSum/k;
    }
}