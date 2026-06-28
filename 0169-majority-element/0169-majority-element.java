class Solution {
    public int majorityElement(int[] arr) {
        int count=0;
        int candidate=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
            candidate=arr[i];
            count=1;
            }
            else if(candidate==arr[i]){
                count++;
            }
            else{
                count--;
            }

        }
        count=0;
        for(int i=0;i<arr.length;i++){
            if(candidate==arr[i]){
                count++;
            }

        }
        if(count>(arr.length)/2){
            return candidate;
        }
        else{
            return -1;
        }
    }
}