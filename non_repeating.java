package string;

public class non_repeating {
    public static void main(String[] args) {
        String s="prepinsta";
        boolean flag=true;
        for(char c:s.toCharArray()){
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.println("first non repeating char is at -> "+ c);
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("there is no non repeating char in string");
    }
}
