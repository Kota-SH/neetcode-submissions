class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i = 0; i<=n; ++i) {
            int r = 0;
            int c = i;
            while (c != 0) {
                c &= (c-1);
                r += 1;
            }
            res[i] = r;
        }
        return res;
    }
}
