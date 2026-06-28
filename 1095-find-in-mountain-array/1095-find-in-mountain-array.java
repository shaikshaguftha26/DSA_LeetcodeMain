/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        //step 1 my peak dhundungi pehle 
        int low=0;
        int high=mountainArr.length()-1;
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(mountainArr.get(mid)<mountainArr.get(mid+1)){
                low=mid+1;
            }
            else{
               
                high=mid;
            }

        }
        
          int peak=low;
      
        int l=0;
        int r=peak;
        
       while(l<=r){
        int mid=(l+r)/2;
        if(mountainArr.get(mid)==target){
            return mid;
        }
        else if(mountainArr.get(mid)<target){
            l=mid+1;

        }
        else{
           r=mid-1;
        }


       }
       int i=peak;
       int j=mountainArr.length()-1;
       while(i<=j){
        int mid=(i+j)/2;
        if(mountainArr.get(mid)==target){
            return mid;
        }
        else if(mountainArr.get(mid)<target){
            j=mid-1;
        }
        else{
           i=mid+1;
        }
       }
return -1;
    }
   
}