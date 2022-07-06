package string;



public class removeBrackets {
    public static void main(String[] args) {
        String s = "(a+b)=c";
        String ans=s.replaceAll("[(){}]","");
        System.out.println(ans);
    }

}
