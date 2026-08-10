class Solution {
    public boolean isValid(String s) {
        if (s.length() < 2) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> b = new HashMap<>();
        b.put(')', '(');
        b.put('}', '{');
        b.put(']', '[');
        
        for (int i = 0; i < s.length(); ++i) {
            if (!b.containsKey(s.charAt(i))) {
                st.push(s.charAt(i));
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char c = st.pop();
                if (c != b.get(s.charAt(i))) {
                    return false;
                }
            }
        }
        if (st.size() != 0) {
            return false;
        }
        return true;

    }
}
