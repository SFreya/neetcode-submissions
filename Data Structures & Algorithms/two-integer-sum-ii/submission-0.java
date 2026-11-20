class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            //calculate the compliment of the target
            int compliment=target-numbers[i];

            //check if already present in hashmap
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[] {};
        
    }
}
