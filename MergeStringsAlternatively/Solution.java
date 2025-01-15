package MergeStringsAlternatively;

class Solution {
    public String mergeAlternately(String word1, String word2) {

        String ret = "";
        int i = 0;
        int j = 0;
        while (i + j < word1.length() + word2.length()) {
            if ((i + j) % 2 == 0) {
                if (i < word1.length()) {
                    ret += word1.charAt(i);
                    i++;
                } else {
                    ret += word2.charAt(j);
                    j++;
                }
            } else {
                if (j < word2.length()) {
                    ret += word2.charAt(j);
                    j++;
                } else {
                    ret += word1.charAt(i);
                    i++;
                }

            }

        }

        return ret;

    }
}
