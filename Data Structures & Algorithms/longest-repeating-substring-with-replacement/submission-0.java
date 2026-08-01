class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int left=0;
        int maxlen=0;

        for(int right=0;right<s.length();right++){
            count.put(s.charAt(right), count.getOrDefault(s.charAt(right),0)+1);

            int maxfreq=0;
            for(int freq : count.values()){
                maxfreq= Math.max(freq, maxfreq);
            }
            int wl= right-left+1;

            while(wl-maxfreq>k){
                char lc = s.charAt(left);
                count.put(lc, count.get(lc)-1);
                left++;
                wl = right-left+1;
            }
            maxlen= Math.max(wl, maxlen);
        }
        return maxlen;
    }
}
