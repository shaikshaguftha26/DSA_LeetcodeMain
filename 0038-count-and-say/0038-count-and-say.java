class Solution {
    public String countAndSay(int n) {
        String current="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
            int j=0;
            while(j<current.length()){
                char ch=current.charAt(j);
                int count=0;
                while(j<current.length() && current.charAt(j)==ch){
                    count++;
                    j++;
                }
               sb.append(count);
               sb.append(ch);
          }
          current=sb.toString();
        }
return current;
    }
}