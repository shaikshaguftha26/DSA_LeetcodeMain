class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=0;
        int high=0;
        for(int num:bloomDay){
            low=Math.min(num,low);
            high=Math.max(num,high);
        }
   
        if((long)m*k>bloomDay.length) return -1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(isPossible(bloomDay,mid,k,m)){
                
                high=mid-1;

            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
    public boolean isPossible(int[] arr,int mid,int k,int m){
       int count=0;
       int bouquets=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid){
                count++;
                
            
            if(count==k){
                 bouquets++;
                 count=0;
            }
            }
                else{
               
              count=0;
            
            } 
            
        }
     
        return bouquets>=m;
        
    }
}