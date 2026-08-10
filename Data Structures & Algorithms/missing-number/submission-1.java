class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length/2;
        int as = 0;

        for (int i = 0; i < nums.length; ++i) {
            as += nums[i];
        }
        return (sum == as) ? 0 : (sum - as);
    }
}
