class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps= new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           //calculate compliment
           int compliment=target-nums[i];
           //check if it already exists in map
           if(maps.containsKey(compliment)){
            return new int [] {maps.get(compliment),i};
           }
           //else store number and its index
           maps.put(nums[i],i);
        }
        return new int[] {};
    }
}
