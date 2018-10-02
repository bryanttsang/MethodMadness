package BTsangLib;

public class TestFile {

    public static String vigCipher(String message, String key)
    {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length = message.length();
        String encoded = "";
        int shift = Integer.parseInt(key);
        int letter = 0;
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
    }
}
