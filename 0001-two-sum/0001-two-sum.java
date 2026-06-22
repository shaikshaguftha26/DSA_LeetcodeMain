class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int a=arr[i];
            int b=target-a;
            if(map.containsKey(b)){
             return new int[]{map.get(b),i};
            
            }
        map.put(a,i);
        }
return new int[]{-1,-1};
    }
    
}