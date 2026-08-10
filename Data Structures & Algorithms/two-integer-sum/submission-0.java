class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; ++i) {
            m.put(target-nums[i], i);
        }
        for (int j = 0; j < nums.length; ++j) {
            if ((m.containsKey(nums[j])) && (m.get(nums[j]) != j)) {
                int i = m.get(nums[j]);
                if (i < j) {
                    res[0] = i;
                    res[1] = j;
                } else {
                    res[0] = j;
                    res[1] = i;
                }
            }
        }

        return res;
    }
}
