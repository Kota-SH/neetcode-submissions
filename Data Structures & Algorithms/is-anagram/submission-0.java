class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sc = new HashMap<>();
        HashMap<Character, Integer> tc = new HashMap<>();
        for(char c : s.toCharArray()) {
            sc.put(c, sc.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            tc.put(c, tc.getOrDefault(c, 0) + 1);
        }

        return tc.equals(sc);
    }
}
