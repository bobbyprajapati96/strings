package string;

public class removeAllChar_except_alphabet {
    public static void main(String[] args) {
        String s="tush@ar#";
//        System.out.println(s.replaceAll("[^a-zA-Z]",""));

        //Or meethod two
        for (int i = 0; i < s.length(); i++)
        {
            // Finding the character whose
            // ASCII value fall under this
            // range
            if (s.charAt(i) < 'A' || s.charAt(i) > 'Z' && s.charAt(i) < 'a' || s.charAt(i) > 'z')
            {

                // erase function to erase
                // the character
                System.out.println(i);
                s = s.substring(0, i) + s.substring(i + 1);
                i--;
            }
        }
        System.out.print(s);
    }
}
