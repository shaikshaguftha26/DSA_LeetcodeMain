class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b'||text.charAt(i)=='a'||text.charAt(i)=='l'||text.charAt(i)=='o'||text.charAt(i)=='n'){
            freq[text.charAt(i)-'a']++;
        }
    
        } 
        int bcount=freq['b'-'a'];
        int acount=freq['a'-'a'];
        int lcount=freq['l'-'a']/2;
        int ocount=freq['o'-'a']/2;
        int ncount=freq['n'-'a'];
        return Math.min(bcount,Math.min(acount,Math.min(lcount,Math.min(ocount,ncount))));

        
    }
}