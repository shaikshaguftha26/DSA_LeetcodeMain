class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        int m=s.length();
        int n=t.length();
        if(m!=n) return false;
    
        for(int i=0;i<m;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
        if(freq[i]!=0){
            return false;
        }
        }
       return true; 
    }
}