class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char[] ch=s.toCharArray();
        while(i<=j){
            if(!Character.isLetter(s.charAt(i))){
                i++;
                continue;

            }
            else   if(!Character.isLetter(s.charAt(j))){
                j--;
                continue;

            }
            else{
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
        }
        return new String(ch);
        
    }
}