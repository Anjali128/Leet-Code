class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] ar = new int[nums.length];
        int index = 0;
        for(int i=0; i<n; i++){
            ar[index++] = nums[i];
            ar[index++] = nums[i+n];
        }
        return ar;
    }
}