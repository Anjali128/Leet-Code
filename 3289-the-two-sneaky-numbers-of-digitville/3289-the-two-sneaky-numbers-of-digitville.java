class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int [] freq = new int[nums.length -2];
        int [] sn = new int[2];
        int index =0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] == 2){
                sn[index] = nums[i];
                index ++;
            }
            if(index == 2)
               break;
        }
        return sn;
    }
}
