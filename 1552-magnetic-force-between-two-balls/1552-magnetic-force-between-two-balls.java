class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1;
        int high=position[n-1]-position[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(position,m,mid)){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return high;

        
    }
    public static boolean isPossible(int[] arr,int k, int mid){
        int countCows=1;
        int pastStall=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-pastStall>=mid){
                countCows++;
                pastStall=arr[i];
            }
        }
        return countCows==k;
}
}