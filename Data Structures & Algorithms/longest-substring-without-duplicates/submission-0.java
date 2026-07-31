class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left =0;
        int maxlen = 0;

        for(int right=0; right<s.length();right++){
            char c = s.charAt(right);

            while(window.contains(s.charAt(right))){
                window.remove(s.charAt(left));
                left++;
            }
            window.add(s.charAt(right));
            maxlen= Math.max(maxlen, right-left+1);
        }
        return maxlen;
    }
}
