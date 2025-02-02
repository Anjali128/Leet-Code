class Solution {
    public int numIdenticalPairs(int[] nums) {
        //HashMap <Integer, Integer>map = new HashMap <> ();
        int count=0;
        for (int i=0; i<nums.length -1; i++){
            for(int j=1; j<nums.length; j++){
                if (nums[i] == nums[j] && i<j){
                   //map.put(i,j);
                   count++;
                }
            }
        }
        return count;
    }
}