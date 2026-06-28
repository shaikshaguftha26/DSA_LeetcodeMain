class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int oddCount=0;
        int niceSub=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                oddCount++;
            }
           int previousOdd=oddCount-k;
           niceSub+=map.getOrDefault(previousOdd,0);
           map.put(oddCount,map.getOrDefault(oddCount,0)+1);
        }
        return niceSub;
    }
}