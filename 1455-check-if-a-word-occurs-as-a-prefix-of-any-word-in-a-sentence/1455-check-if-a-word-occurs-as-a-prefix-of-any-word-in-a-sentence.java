class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++){
            if(words[i].length()<searchWord.length()){
               continue;
            }
            boolean matched=true;
            for(int j=0;j<searchWord.length();j++){
                if(words[i].charAt(j)!=searchWord.charAt(j)){
               matched=false;
              break;

                }
               
                 
            }
            if(matched){
                return i+1;
            }
            
        }

       return -1; 
    }
}