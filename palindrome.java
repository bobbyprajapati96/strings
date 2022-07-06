package string;

public class palindrome {
    public static void main(String[] args) {
        String s="Nitin";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt((i));
        }
        if(s.equalsIgnoreCase(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("not palindrome");
    }
}
