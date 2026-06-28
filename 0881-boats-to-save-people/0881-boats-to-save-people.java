class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int lightest=0;
        int heaviest=people.length-1;
        int countBoats=0;
        while(lightest<=heaviest){
            if(limit-people[heaviest]>=people[lightest]){
                countBoats++;
                heaviest--;
                lightest++;
            }
            else{
                countBoats++;
                heaviest--;
            }
        }
       return countBoats; 
    }
}