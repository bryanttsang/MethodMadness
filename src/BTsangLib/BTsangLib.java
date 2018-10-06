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
        String factors1 = " ";
        String factors2 = " ";
        String factors3 = " ";
        for (int i1 = 1; i1 <= num1; i1++)
        {
            if (num1 % i1 == 0)
            {
                String ii1 = Integer.toString(i1);
                factors1 = factors1 + ii1 + " ";
            }
            else {}
        }
        for (int i2 = 1; i2 <= num2; i2++)
        {
            if (num2 % i2 == 0)
            {
                String ii2 = Integer.toString(i2);
                factors2 = factors2 + ii2 + " ";
            }
            else {}
        }
        for (int i3 = 1; i3 <= num3; i3++)
        {
            if (num3 % i3 == 0)
            {
                String ii3 = Integer.toString(i3);
                factors3 = factors3 + ii3 + " ";
            }
            else {}
        }
        int l1 = factors1.length();
        int l2 = factors2.length();
        int l3 = factors3.length();
        int long = 0;
        if (l1 >= l2 && l1 >= l3)
        {
            long = l1;
        }
        if (l2 >= l1 && l2 >= l3)
        {
            long = l2;
        }
        else
        {
            long = l3;
        }
        int index11 = factors1.indexOf(" ");
        int index12 = factors1.indexOf(factors1.substring(index11 + 1));
        while (int il < long)
        {
            
        }
    }
}
