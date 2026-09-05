class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // 1. Turn word into characters
            char[] chars = s.toCharArray();

            // 2. Sort the characters
            Arrays.sort(chars);

            // 3. Make our secret ID
            String key = new String(chars);

            // 4. Create basket if it doesn't exist
            map.putIfAbsent(key, new ArrayList<>());

            // 5. Put the original word into that basket
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
        
    
}
