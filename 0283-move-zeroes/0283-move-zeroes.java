class Solution {
    public void moveZeroes(int[] arr) {
        int size=arr.length;
        if(size<=0) return;
       int i=0;
       int j=0;
      while(i<size){
      if(arr[i]!=0){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j++;
       }
       else{
        i++;
       }
      }
        }
    }
