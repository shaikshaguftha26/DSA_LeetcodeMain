class Solution {
    public int maxProduct(int n) {
        int res=0;
        if(n>=10 && n<=99){
        int digit=n%10;
        int next=n/10;
        res=digit*next;
        }
else{
     int max1=0;
    int max2=0;
    while(n>0){
   
    int digit2=n%10;
    n=n/10;
    if(max1<digit2){
           max2=max1;
        max1=digit2;
     
    }
    else if(digit2>max2){
        max2=digit2;
    }
res=max1*max2;
    }
}
return res;
        
    }
}