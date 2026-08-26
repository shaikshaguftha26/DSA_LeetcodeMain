class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int res=n/2;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(candyType[i]);
        }
        return Math.min(res,set.size());
    }
}