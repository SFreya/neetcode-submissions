class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Build frequency map
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create frequency buckets
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // Step 3: Collect top K elements
        int[] result = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i >= 1; i--) {

            if (buckets[i] != null) {

                for (int num : buckets[i]) {
                    result[index++] = num;

                    if (index == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}