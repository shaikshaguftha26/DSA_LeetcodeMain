class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransom=new HashMap<>();
        HashMap<Character,Integer> mag=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            ransom.put(ransomNote.charAt(i),ransom.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            mag.put(magazine.charAt(i),mag.getOrDefault(magazine.charAt(i),0)+1);
        }
       for(int i=0;i<ransomNote.length();i++){
        if(mag.getOrDefault(ransomNote.charAt(i),0)<ransom.get(ransomNote.charAt(i))){
            return false;
          
        }
          
        
       }

        
       return true; 
    }
}