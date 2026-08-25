class Solution {
    public int[] replaceElements(int[] arr) {
        int n= arr.length;
        int[] res= new int[n];
        int maxsofar= -1;

        for(int i=n-1;i>=0;i--){
            res[i]= maxsofar;
            maxsofar= Math.max(maxsofar, arr[i]);
        }
        return res;
    }
}