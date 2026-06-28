class Solution {
    public int maxOperations(int[] arr, int k) {
        Arrays.sort(arr);
        int count=0;
        int left=0;
        int right=arr.length-1;
     
        while(left<right){
           int sum=arr[left]+arr[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum<k){
                left++;

            }
            else{
                right--;
            }
        }
        return count;
    }
}