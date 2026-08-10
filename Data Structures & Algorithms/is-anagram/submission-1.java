class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sc = new HashMap<>();
        HashMap<Character, Integer> tc = new HashMap<>();
        for(char c : s.toCharArray()) {
            sc.put(c, sc.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()) {
            sc.put(c, sc.getOrDefault(c, 0) - 1);
        }

        for (Map.Entry<Character, Integer> item : sc.entrySet()) {
            if (item.getValue() != 0) {
                return false;
            }
        }
        return true;        
    }
}
