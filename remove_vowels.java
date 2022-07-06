package string;

public class remove_vowels {
    public static void main(String[] args) {
        String s="prepration";
        String ans=s.replaceAll("[aeiou]","");
        System.out.println(ans);
    }
}
