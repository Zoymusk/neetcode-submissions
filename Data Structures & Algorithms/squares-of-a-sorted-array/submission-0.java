class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int pos = nums.length - 1;
        int[] result = new int[nums.length];

        while(left<=right){
            int lSq= nums[left]*nums[left];
            int rSq= nums[right]*nums[right];

            if(lSq>rSq){
                result[pos]= lSq;
                left++;
            }
            else{
                result[pos]= rSq;
                right--;
            }
            pos--;
        }
        return result;        
    }
}
