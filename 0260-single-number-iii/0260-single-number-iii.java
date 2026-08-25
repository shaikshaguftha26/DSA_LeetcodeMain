class Solution {
    public int[] singleNumber(int[] nums) {

        List<Integer> list =new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
           
        }
for(Map.Entry<Integer,Integer> map1:map.entrySet()){
    if(map1.getValue()==1){
        list.add(map1.getKey());
    }
}
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        
        return result;
    }
}