package GreatestCommonDivisorOfStrings;

public class BetterSolution {
    public String gcdOfStrings(String str1, String str2) {
        // since str2 is supposed to be many of the same pieces (t),
        // then if you add str1 to str2, it should give the same string no matter the
        // order
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // notice how the gcd is the same length as the first term in str1
        int lenGCD = gcd(str1.length(), str2.length());
        return str1.substring(0, lenGCD);
    }

    private int gcd(int len1, int len2) {
        while (len2 != 0) {
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}
