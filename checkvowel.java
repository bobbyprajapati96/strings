package string;

public class checkvowel
{
    public static boolean isLowerCaseVowel(char c)
    {
        if(c == 'a'|| c=='e'|| c=='i' || c=='o' || c=='u')
        {
            return true;
        }
        return false;
    }
    public static boolean isUpperCaseVowel(char c)
    {
        if(c == 'A'|| c=='E'|| c=='I' || c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s1="Tushar";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(isLowerCaseVowel(c) || isUpperCaseVowel(c))
                System.out.println(c+" is a vowel");
            else
                System.out.println(c+" is a consonant");
        }
    }
}
