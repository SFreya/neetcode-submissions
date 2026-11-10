class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();

        for(String str:strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);


            map.putIfAbsent(sorted, new ArrayList<>());
            map.get(sorted).add(str);
        }

        List<List<String>> result=new ArrayList<>();
        result.addAll(map.values());
        return result;
        
    }
}
