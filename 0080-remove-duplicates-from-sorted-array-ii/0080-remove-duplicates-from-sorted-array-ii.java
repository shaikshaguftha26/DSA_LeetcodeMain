class Solution {
    public int removeDuplicates(int[] arr) {
         int n=arr.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(i<2 || arr[j]!=arr[i-2]){
                arr[i]=arr[j];
                i++;

            }
        }
        return i;
    }
}