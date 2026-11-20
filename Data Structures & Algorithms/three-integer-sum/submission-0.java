class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int compliment=0-nums[i]-nums[j];

                //two sum logic now
                if(map.containsKey(compliment)){
                    if (!result.contains(Arrays.asList(nums[i], compliment, nums[j]))){
                        result.add(Arrays.asList(nums[i], compliment, nums[j]));
                    }
                    
                }
                map.put(nums[j],i);
            }
        }
        return result;
        
    }
}
