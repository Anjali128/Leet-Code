class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue <int[]> pq = new PriorityQueue<> (
            (a,b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]
        );

        for(int i=0; i<nums.length; i++){
            pq.offer(new int[] {nums[i], i});
        }

        while(k!=0){
            int min[] = pq.poll();
            int num = min[0];
            int idx = min[1];
            nums[idx] = num*multiplier;
            pq.offer(new int[] {nums[idx] , idx});
            k--;
        }
        return nums;
    }
}