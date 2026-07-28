class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
          
          Arrays.sort(nums);
          int n=nums.length;
           
          for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            int j=i+1;
            int k=n-1;

            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                int target =0;

                if(sum==target){
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]){j++; }
                    while(j<k && nums[k]==nums[k+1]){k--;}
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
          }
          return res;
    }
}
