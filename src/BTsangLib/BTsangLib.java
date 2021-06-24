package BTsangLib;

import java.util.HashSet;

public class BTsangLib {

    /**
     * checks if a string is palindrome
     * @param s string you want to check
     * @return true if the string is palindrome, false if it is not
     */
    public static boolean isPalindrome(String s)
    {
        int len = s.length();
        for (int i = 0; i < len/2; i++) {
            if (s.charAt(i) != s.charAt(len-1-i))
                return false;
        }
        return true;
    }

    /**
     * change the format of a date from "mm/dd/yyyy" to "dd - mm - yyyy"
     * @param d date in the format "mm/dd/yyyy"
     * @return date in the format "dd - mm - yyyy"
     */
    public static String dateStr(String d)
    {
        return d.substring(3, 5) + " - " + d.substring(0, 2) + " - " + d.substring(6, 10);
    }

    /**
     * remove the first occurrence of a string from another string
     * @param mainStr the string you want something to remove from
     * @param subStr what to remove
     * @return mainStr with the first occurrence of subStr removed
     */
    public static String cutOut(String mainStr, String subStr)
    {
        return mainStr.replaceFirst(subStr, "");
    }

    /**
     * encrypt a uppercase-only string with Caesar cipher
     * @param message the string to be encrypted
     * @param key the number of letters to shift right
     * @return the encrypted string
     */
    public static String vigCipher(String message, String key)
    {
        int shift = Integer.parseInt(key) % 26;
        String encoded = "";
        for (int i = 0; i < message.length(); i++) {
            int c = message.charAt(i) + shift;
            encoded += (char)(c > 'Z' ? c-26 : c);
        }
        return encoded;
    }

    /**
     * finds how many unique letters 2 or more words of 3 words share
     * @param word1 the first word
     * @param word2 the second word
     * @param word3 the third word
     * @return the number of unique letters they share
     */
    public static int stringUnion(String word1, String word2, String word3)
    {
        int[] occur = new int[26];
        HashSet<Character> set = new HashSet<>();
        int unique = 0;

        for (char c : word1.toCharArray()) {
            if (set.add(c))
                occur[c - 'a']++;
        }
        set.clear();

        for (char c : word2.toCharArray()) {
            if (set.add(c)) {
                if (++occur[c - 'a'] == 2)
                    unique++;
            }
        }
        set.clear();

        for (char c : word3.toCharArray()) {
            if (set.add(c) && occur[c - 'a'] == 1)
                unique++;
        }

        return unique;
    }

    /**
     * checks if a number is a Fibonacci
     * @param n a number you want to check
     * @return true if it is Fibonacci, false if it is not
     */
    public static boolean isFibonnaci(int n)
    {
        return (Math.sqrt(5 * n*n + 4) * (int)Math.sqrt(5 * n*n + 4) == 5 * n*n + 4 || Math.sqrt(5 * n*n - 4) * (int)Math.sqrt(5 * n*n - 4) == 5 * n*n - 4);
    }

    /**
     * find the consecutive sum from 0 to n
     * @param n a number to input
     * @return the consecutive sum from 0 to n
     */
    public static int sumUpTo(int n)
    {
        return (n * n + n) / 2;
    }

    /**
     * find the roots of a quadratic equation in the form ax^2 + bx + c
     * @param a quadratic coefficient
     * @param b linear coefficient
     * @param c constant
     * @return roots
     */
    public static String quadSolver(double a, double b, double c)
    {
        double discriminant = b*b - 4*a*c;
        if (discriminant == 0)
            return "x = " + ((-1 * b) / (2 * a));
        if (discriminant > 0)
            return "x = " + (((-1 * b) + (Math.sqrt(discriminant))) / (2 * a)) + ", " + (((-1 * b) - (Math.sqrt(discriminant))) / (2 * a));
        if (b == 0)
            return "x = ± " + (Math.sqrt(Math.abs(discriminant)) / (2 * a)) + "i";
        return "x = " + ((-1 * b) / (2 * a)) + " ± " + (Math.sqrt(Math.abs(discriminant)) / (2 * a)) + "i";
    }

    /**
     * finds the least common multiple of 3 numbers
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     * @return the least common multiple of all 3 numbers
     */
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int max = Math.max(Math.max(num1, num2), num3);
        int m = max;
        while (Integer.MAX_VALUE - m > max) {
            if (m % num1 == 0 && m % num2 == 0 && m % num3 == 0)
                return m;
            m += max;
        }
        return -1;
    }

}
