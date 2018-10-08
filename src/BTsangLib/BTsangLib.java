package BTsangLib;

public class BTsangLib {

    
    /**
     * checks if a string is palindrome
     * @param s string you want to check
     * @return true if the string is palindrome, false if it is not
     */
    public static boolean isPalindrome(String s)
    {
        String r = "";
        int l = s.length();
        if (l <= 1)
        {
            return true;
        }
        else
        {
            for (int i = l - 1; i >= 0; i--)
            {
                r = r + s.charAt(i);
            }
            return (s.equals(r));
        }
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
        int main = mainStr.length();
        int sub = subStr.length();
        int index = mainStr.indexOf(subStr);
        if (index == 0)
        {
            return mainStr.substring(sub);
        }
        if (index < 0)
        {
            return mainStr;
        }
        if (index + subStr.length() == mainStr.length())
        {
            return mainStr.substring(0, index - 1);
        }
        return mainStr.substring(0, index) + mainStr.substring(index + subStr.length());
    }


    /**
     * encrypt a uppercase-only string with Caesar cipher
     * @param message the string to be encrypted
     * @param key the number of letters to shift right
     * @return the encrypted string
     */
    public static String vigCipher(String message, String key)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = message.length();
        String encoded = "";
        int shift = Integer.parseInt(key);
        int letter;
        for (int i = 0; i < length; i++)
        {
            if ((alphabet.indexOf(message.charAt(i)) + shift) > 25)
            {
                letter = alphabet.indexOf(message.charAt(i)) - 26 + shift;
            }
            else
            {
                letter = alphabet.indexOf(message.charAt(i)) + shift;
            }
            encoded = encoded + alphabet.charAt(letter);
        }
        return encoded;
    }


    public static int stringUnion(String word1, String word2, String word3)
    {

    }


    /**
     * checks if a number is a Fibonacci
     * @param n a number you want to check
     * @return true if it is Fibonacci, false if it is not
     */
    public static boolean isFibonnaci(int n)
    {
        int addend1 = 0;
        int addend2 = 1;
        int sum = 1;
        while (sum <= 2147483647)
        {
            if (n < 0)
            {
                return false;
            }
            if (sum == n || n == 0)
            {
                return true;
            }
            else
            {
                addend1 = addend2;
                addend2 = sum;
                sum = addend1 + addend2;
            }
        }
        return false;
    }


    /**
     * find the consecutive sum from 0 to n
     * @param n a number to input
     * @return the consecutive sum from 0 to n
     */
    public static int sumUpTo(int n)
    {
        return ((n + 1) / 2) * n;
    }


    /**
     * find the roots of a quadratic equation in the form ax^2 + bx + c
     * @param a quadratic coefficient
     * @param b linear coefficient
     * @param c constant
     * @return
     */
    public static String quadSolver(double a, double b, double c)
    {
        double discriminant = b * b - 4 * a * c;
        if (discriminant == 0)
        {
            double x = (-1 * b) / (2 * a);
            return "x = " + Double.toString(x);
        }
        if (discriminant > 0)
        {
            double x1 = ((-1 * b) + (Math.sqrt(discriminant))) / (2 * a);
            double x2 = ((-1 * b) - (Math.sqrt(discriminant))) / (2 * a);
            return "x = " + Double.toString(x1) + ", " + Double.toString(x2);
        }
        if (b == 0)
        {
            return "Imaginary roots due to negative discriminant." + " x = " + "±" + Double.toString(((Math.sqrt(Math.abs(discriminant))) / (2 * a))) + "i";
        }
        else
        {
            return "Imaginary roots due to negative discriminant." + " x = " + Double.toString(((-1 * b) / (2 * a))) + " ± " + Double.toString(((Math.sqrt(Math.abs(discriminant))) / (2 * a))) + "i";
        }
    }


    /**
     * finds the least common multiple of 3 numbers
     * @param num1 first number
     * @param num2 second number
     * @param num3 third number
     * @return the least common multiple of all 3 nummbers
     */
    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        int lcm12 = num1;
        int i = lcm12;
        for (i = lcm12; i <= (num1 * num2); i++)
        {
            if (i % num1 == 0 && i % num2 == 0)
            {
                lcm12 = i;
                i = num1 * num2 + 1;
            }
            else
            {
                i = i;
            }
        }
        int lcm = lcm12;
        int ii = lcm;
        for (ii = lcm; ii <= lcm12 * num3; ii++)
        {
            if (ii % lcm12 == 0 && ii % num3 == 0)
            {
                lcm = ii;
                ii = lcm12 * num3 + 1;
            }
            else
            {
                ii = ii;
            }
        }
        return lcm;
    }
    
    
}
