class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] freq = new int[101]; 
        int count =0;
        for(int i: nums){
            count = count+freq[i];
            freq[i]++;
        }
        return count;
    }
}