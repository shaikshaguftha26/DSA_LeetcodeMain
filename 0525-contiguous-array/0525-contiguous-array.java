class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int length=0;
        int countZero=0;
        int countOne=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                countZero++;
            }
            else{
            countOne++;
            }
            int diff=countZero-countOne;
            if(diff==0){
            length=Math.max(length,i+1);//here i+ because we are taking length not index 
           
            }
            if(!map.containsKey(diff)){
            map.put(diff,i);
        }else{
           int len=i-map.get(diff);
            length=Math.max(length,len);
        }
        }
return length;
  }
}