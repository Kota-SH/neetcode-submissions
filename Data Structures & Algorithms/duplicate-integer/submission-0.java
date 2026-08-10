class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> n = new HashSet<>();
        for (int i : nums) {
            if (!n.add(i)) {
                return true;
            }
        }
        return false;
    }
}