class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return" ";

        for(int i=0;i<strs[0].length();i++){
            char c= strs[0].charAt(i);
            for(String w:strs){
                if(i>=w.length() || w.charAt(i)!=c){
                   return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}