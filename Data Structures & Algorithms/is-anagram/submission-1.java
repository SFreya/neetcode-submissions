class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }

        for(int i=0;i<s.length() && i<t.length();i++){
            char ch=s.charAt(i);
            char xy=t.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            map.put(xy,map.getOrDefault(xy,0)-1);
        }
        for(int freq:map.values()){
            if(freq!=0){
                return false;
            }
        }
        return true;

    }
}
