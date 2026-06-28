class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        int low=0;
        int high=n-1;
        
        while(low<high){
            int mid=(low+high)/2;
            
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]){
                    low=mid+1;
                }else{
                   high=mid;
                }
            }
           else{
            if(arr[mid]==arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid;
            }

            }
        }
        return arr[low];
    }
}