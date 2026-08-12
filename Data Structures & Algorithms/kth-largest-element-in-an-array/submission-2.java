class Solution {
    public int findKthLargest(int[] nums, int k) {
        //return Arrays.stream(nums).sorted().toArray()[nums.length-k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}
