class Solution {
    public int findGCD(int[] arr) {
        int a=Integer.MAX_VALUE;
        int b=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>b){
                b=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<a){
                a=arr[i];
            }
        }
        return gcd(a,b);

    }
    public int gcd(int a,int b){
if(b==0){
    return a;
}
 return gcd(b,a%b);
    }
}