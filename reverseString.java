class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char curr = s[i]; 
            char finalc = s[s.length - 1 - i]; // last char in array 
            s[s.length - 1 - i] = curr;
            s[i] = finalc;
        }
        
    }
}
