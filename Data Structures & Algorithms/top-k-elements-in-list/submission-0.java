class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        List<Integer>[] buckets= new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            buckets[i] = new ArrayList<>();
        }

        for(int num : count.keySet()){
            int freq = count.get(num);
            buckets[freq].add(num);
        }

        int[] res = new int[k];
        int index=0;

        for(int i= buckets.length-1;i>=0 && index<k;i--){
           for(int num : buckets[i]){
            res[index++] = num;
            if(index == k) break;
           }
        }
        return res;
    }
}
