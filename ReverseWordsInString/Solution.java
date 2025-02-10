class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // remove leading and trailing spaces 
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(i > 0 ? " " : "");
        }
        return sb.toString();
    }
}