package string;

public class toggleCharacters {
    public static void main(String[] args) {
        String s1="Tushar";
        String s="";
        for(int i=0;i<s1.length();i++)
        {
          if(Character.isUpperCase(s1.charAt(i))){
              s+=s+Character.toLowerCase(s1.charAt(i));
          }
          else
              s=s+Character.toUpperCase(s1.charAt(i));
        }
        System.out.println(s);
    }

}
