class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
           int remainder=sum%k;
        //   if(remainder<0){
        //     remainder+=k;
        //   }instead of this we can do
        remainder=(remainder % k + k )% k;
                count+=map.getOrDefault(remainder,0);
            
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }
    
    return count;
    }
}