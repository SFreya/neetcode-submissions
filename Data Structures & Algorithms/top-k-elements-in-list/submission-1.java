class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer>maps=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            maps.put(nums[i],maps.getOrDefault(nums[i],0)+1);

        }
        List<Integer> list=new ArrayList<>(maps.keySet());
        list.sort((a, b) -> maps.get(b) - maps.get(a));
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=list.get(i);
        }
        return result;
        
    }
}
