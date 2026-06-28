class Solution {
    public boolean isPerfectSquare(int num) {
        int low=1;
        int high=num;
        
        while(low<=high){
            long mid=(low+high)/2;
            if((long)mid*mid==num){
              
                return true;
               

            }
            else if((long)mid*mid<num){
               
                 low=(int)mid+1;
            }
            else{
                   high=(int)mid-1;
            }

        }
        return false;
}
}