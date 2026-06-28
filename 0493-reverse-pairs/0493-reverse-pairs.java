class Solution {
    public int reversePairs(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
       int count=divide(nums,low,high);
    
    return count;
    }
    public static int divide(int[] arr,int low,int high){
        int mid=(low+high)/2;
        int count=0;
        while(low<high){
            count+=divide(arr,low,mid);
            count+=divide(arr,mid+1,high);
            count+=countPairs(arr,low,mid,high);
            merge(arr,low,mid,high);
            return count;
        }
        return 0;
    }
    public static int countPairs(int[] arr,int low,int mid,int high){
        int count=0;
        int right=mid+1;
        for(int i=low;i<=mid;i++){
            while(right<=high && (long)arr[i]>2L*arr[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }
            else{
                temp[k++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]=arr[i++];

        }
        while(j<=high){
            temp[k++]=arr[j++];
        }
        for( i=low,k=0;i<=high;i++,k++){
            arr[i]=temp[k];
        }
    }
}