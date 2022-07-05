package string;

import sun.font.DelegatingShape;

public class check_AlphabetorNot {
    public static void main(String[] args) {
        char c='a';
        if((c>= 'a' && c<='z' ) || (c>='A' &&  c<='Z'))
            System.out.println(c+ " -> It is alphabet");
        else
        System.out.println(c+ " -> is not an alphabet");
    }
}
