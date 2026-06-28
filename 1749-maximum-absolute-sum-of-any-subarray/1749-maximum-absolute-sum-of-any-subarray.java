class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int n=arr.length;
        int maxSum=arr[0];
        int maxBestEnding=arr[0];
        int minSum=arr[0];
        int minBestEnding=arr[0];
        int absoluteSum=Math.abs(arr[0]);
        for(int i=1;i<n;i++){
            maxBestEnding=Math.max(maxBestEnding+arr[i],arr[i]);
             minBestEnding=Math.min(minBestEnding+arr[i],arr[i]);
            maxSum=Math.max(maxBestEnding,maxSum);
            minSum=Math.min(minBestEnding,minSum);
            absoluteSum=Math.max(Math.abs(maxSum),Math.abs(minSum));

        }
        return absoluteSum;
    }
}