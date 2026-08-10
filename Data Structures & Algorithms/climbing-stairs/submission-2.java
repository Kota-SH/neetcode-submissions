class Solution {
    public int climbStairs(int n) {
        int onestep = 1;
        int twosteps = 1;
        for (int i = 0; i < n-1; i++) {
            int tmp = onestep;
            onestep = onestep + twosteps;
            twosteps = tmp;
        }
        return onestep;
    }
}
