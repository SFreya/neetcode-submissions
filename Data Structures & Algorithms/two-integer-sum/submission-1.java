class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map =new HashMap<>();

        for(int i =0;i<nums.length;i++){

            int needed=target-nums[i];
            Integer index = map.get(needed);

            if(index!=null){
                return new int[]{index,i};
            }

            map.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
