package GreatestCommonDivisorOfStrings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l2 = str2.length();
        int l1 = str1.length();

        // since str1 is made up of multiple equal pieces of str2,
        // the gcd is the den in str
        int gcd = gcdByEuclidsAlgorithm(l1, l2);
        // System.out.println("gcd: " + gcd);

        // divide each string
        // divide a2 by gcd
        // divide a1 by length of
        String[] a2 = null;
        String cd = "";
        if (str2.length() != gcd) {
            a2 = multiples(str2, gcd);
            // System.out.println("a2: " + Arrays.toString(a2));
            // check if the pieces are eq
            if (!check(a2)) {
                // System.out.println("NOT EQUAL PIECES");
                return "";
            }
            cd = a2[0];

        } else {
            cd = str2;
        }

        // System.out.println("cd: " + cd);
        // System.out.println("Divide by " + gcd);

        String[] a1 = multiples(str1, gcd);
        // System.out.println("a1: " + Arrays.toString(a1));

        // check if all their pieces are equal
        if (!check(a1)) {
            return "";
        }

        if (a1[0].equals(cd)) {
            return cd;
        } else {
            return "";
        }
    }

    /**
     * We will take a string and divide it by l so there are equal pieces and put it
     * in an array
     * l is the length of the common denom
     */
    private String[] multiples(String str, int l) {
        // number of pieces
        int p = str.length() / l;
        String[] ret = new String[p];

        int k = 0;
        for (int i = 0; i < str.length(); i += l) {
            if (k < p) {
                ret[k] = str.substring(i, Math.min(i + l, str.length()));
                k++;
            }
        }
        return ret;
    }

    private boolean check(String[] array) {
        Set<String> s = new HashSet<>(Arrays.asList(array));
        return (s.size() == 1);
    }

    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
