class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String s : strs) {
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();

    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            // 1. Find the delimiter '#' to isolate the length prefix
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // 2. Parse the length and extract the exact substring
            int length = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            int end = start + length;
            decoded.add(str.substring(start, end));

            // 3. Move pointer to the start of the next length prefix
            i = end;
        }

        return decoded;

    }
}
