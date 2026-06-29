class Solution {
    public int shipWithinDays(int[] weights, int D) {
        int low=0;
        int high=0;

        for(int num:weights){
            low=Math.max(num,low);
            high+=num;
        }

        while(low<=high){
            int mid=(low+high)/2;
            if(capacity(weights,D,mid)){
               high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return low;
       
        
    }
    public boolean capacity(int[] arr,int D,int capacity){
        int days=1;
        int currentWeight=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>capacity) return false;
           
            if(currentWeight+arr[i]<=capacity){
                currentWeight+=arr[i];
            }
            else{
                days++;
                currentWeight=arr[i];
            }

        }
        if(days<=D) return true;
        else return false;
    }
}