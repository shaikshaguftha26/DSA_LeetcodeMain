class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int currentSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            currentSum+=nums[i];
            int previous=currentSum-goal;
            count+=map.getOrDefault(previous,0);
            map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        }
        return count;

    }
}