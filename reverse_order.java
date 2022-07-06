package string;

public class reverse_order {
    public static void main(String[] args) {
        String s="tushar";
//        String rev="";
//        for(int i=s.length()-1;i>=0;i--)
//        {
//            rev+=s.charAt(i);
//        }
//        System.out.println(rev);


        //second method using StringBuilder;
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println(sb);
    }
}
