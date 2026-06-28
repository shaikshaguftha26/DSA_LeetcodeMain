class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n=arr.length;
        Arrays.sort(arr);
                 int closest=arr[0]+arr[1]+arr[2];
        for(int i=0;i<n;i++){
            int left=i+1;
            int right=n-1;
   int sum=0;
            while(left<right){
                
                sum=arr[i]+arr[left]+arr[right];
                if(sum==target){
                    return target;
                }
                else if(sum< target) left++;
                else right--;
                if(Math.abs(sum-target)<Math.abs(target-closest)){
                    closest=sum;
                }

            }
        }
        return closest;
    }
}