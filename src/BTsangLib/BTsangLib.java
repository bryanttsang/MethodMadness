package BTsangLib;

public class BTsangLib {


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


    public static String dateStr(String d)
    {
        String mm = d.substring(0, 2);
        String dd = d.substring(3, 5);
        String yyyy = d.substring(6, 10);
        return dd + " - " + mm + " - " + yyyy;
    }


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


    public static int sumUpTo(int n)
    {
        int sum = 0;
        for (int i = 0; i <= n; i++)
        {
            sum = sum + i;
        }
        return sum;
    }


    public static String quadSolver(double a, double b, double c)
    {

    }


    public static int leastCommonMultiple(int num1, int num2, int num3)
    {
        for (int i = 0; i < ??; i++)
        {
            i * num1
        }
        //biggest value = num1 * num2 * num3
    }
}
