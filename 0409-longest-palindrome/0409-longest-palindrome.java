class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        if(n==1) return 1;

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
      int length=0;
      boolean isOdd=false;
      for(Integer val:map.values()){
        if(val%2==0){
            length+=val;
        }
        else{
            length+=(val-1);
            isOdd=true;
        }
       
      
    }
    if(isOdd) length+=1;
      return length;  
    }
}