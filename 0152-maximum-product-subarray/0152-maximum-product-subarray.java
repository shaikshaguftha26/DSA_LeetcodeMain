class Solution {
    public int maxProduct(int[] arr) {
        int n=arr.length;
        int minIndex=arr[0];
        int maxIndex=arr[0];
        int maxProduct=arr[0];
        for(int i=1;i<n;i++){
            int v1=arr[i];
            int v2=maxIndex*arr[i];
            int v3=minIndex*arr[i];
            minIndex=Math.min(v1,Math.min(v2,v3));
            maxIndex=Math.max(v1,Math.max(v2,v3));
            maxProduct=Math.max(maxIndex,Math.max(minIndex,maxProduct));
        }
        return maxProduct;
    }
}