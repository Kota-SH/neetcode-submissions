class Solution {
    public int rob(int[] nums) {
        // int n = nums.length;
        // int[] dp = new int[n];
        // if (nums.length == 1) { return nums[0];}
        // dp[0] = nums[0];
        // dp[1] = Math.max(nums[0], nums[1]);
        
        // for (int i = 2; i <= n-1; ++i) {
        //     dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        // }
        
        // return dp[n-1];

        int bestAti2 = 0;
        int bestAti1 = 0;

        for (int num: nums) {
            int tmp = Math.max(bestAti1, bestAti2+num);
            bestAti2=bestAti1;
            bestAti1=tmp;
        }
        return bestAti1;
    }
}
