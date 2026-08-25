class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mc=0;
        int cc=0;

        for(int num: nums){
            if(num==1){
                cc++;
                mc= Math.max(cc, mc);
            }else{
                cc=0;
            }
        }
        return mc;
    }
}