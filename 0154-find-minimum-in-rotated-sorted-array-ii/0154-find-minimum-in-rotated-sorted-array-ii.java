class Solution {
    public int findMin(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[low]==arr[mid] && arr[high]==arr[mid]){
                low++;
                high--;
                continue;
            }
            if(arr[mid]>arr[high]){
                low=mid+1;

            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}