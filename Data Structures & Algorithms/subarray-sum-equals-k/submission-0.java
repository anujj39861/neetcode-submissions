class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> newmap = new HashMap<>();
        newmap.put(0,1);

        int result = 0;
        int prefixsum = 0;
        for(int num : nums){
            prefixsum += num;
            if(newmap.containsKey(prefixsum - k)){
                result += newmap.get(prefixsum-k);
            }
            newmap.put(prefixsum,newmap.getOrDefault(prefixsum, 0) +1);
        }
        return result;

    }
}