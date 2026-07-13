class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

        }
       
       List<Map.Entry<Character, Integer>> list =
    new ArrayList<>(map.entrySet());
    Collections.sort(list,(e1,e2)->e2.getValue()-e1.getValue());
    StringBuilder ans=new StringBuilder();
    for(Map.Entry<Character,Integer> entry :list){

      char ch=entry.getKey();
    int freq=entry.getValue();
    for(int i=0;i<freq;i++){
        ans.append(ch);
    }
    }
    return ans.toString();
    }
}