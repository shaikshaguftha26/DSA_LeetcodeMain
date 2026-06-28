class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int noDel=arr[0];// ye agar my abhi tak nahi delete hua tho current index par end hone vale subarray ka maxsum kya hai 
        int oneDel=-1; // ye agar maine deletion kar dia tho current index par end hone wale subarray ka maxsum kya hai
        int maxSum=arr[0];
        for(int i=1;i<n;i++){
            int prevNoDelete=noDel;
            noDel=Math.max(noDel+arr[i],arr[i]);
            oneDel=Math.max(prevNoDelete,oneDel+arr[i]);
            maxSum=Math.max(maxSum,Math.max(noDel,oneDel));
        }
        return maxSum;


    }
}