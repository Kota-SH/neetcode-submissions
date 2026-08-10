class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) {return 0;}
        if (nums.length == 1) {return nums[0];}
        int[] dp = new int[nums.length];
        int n = nums.length - 1;
    
        dp[n] = nums[n];
        dp[n-1] = Math.max(nums[n], nums[n-1]);
        for (int i = n-2; i >= 0; --i) {
            dp[i] = Math.max(dp[i+1], nums[i]+dp[i+2]);
        }
        return dp[0];
    }
}
