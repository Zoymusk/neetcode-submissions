class Solution {
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) return false;

       int[] f= new int[26];

       for(int ch : s.toCharArray()){ f[ch - 'a']++;}
       for(int ch : t.toCharArray()){ f[ch - 'a']--;}

       for(int c: f){
        if(c!=0) return false;
       }
       return true;
    }
}
