class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int minLength=Integer.MAX_VALUE;
        int n=arr.length;
        int low=0;
     
        int sum=0;
for(int high=0;high<n;high++){
    sum+=arr[high];

while(sum>=target){
    int len=high-low+1;
    minLength=Math.min(len,minLength);
    sum=sum-arr[low];
    low++;
} 
}
return (minLength==Integer.MAX_VALUE)? 0 :minLength;
    }
}