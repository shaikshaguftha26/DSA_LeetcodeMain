class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int high=0;
        HashSet<Integer> set=new HashSet<>();
        while(high<n){
     
        
           
                while(high-low>k){
                    set.remove(nums[low]);
                    low++;
                   
                }
                 if(set.contains(nums[high])){
                
                return true;
            }else{
            set.add(nums[high]);
            }
            high++;
            }
                
                 return false; 
        }
    
        }
