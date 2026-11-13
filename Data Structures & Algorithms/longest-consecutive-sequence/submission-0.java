class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int longest=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int currentNum=num;
                int length=1;
                while(set.contains(currentNum+1)){
                    currentNum++;
                    length++;
                }
                longest=Math.max(longest,length);
            }
        }
        return longest;
        
    }
}
