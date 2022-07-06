package string;

public class remove_space {
    public static void main(String[] args) {
        String s="  tushar   ";
        String s2="t us h ar";
        System.out.println(s.trim());
        //method 1
//        String ans="" ;
//        int j=0;
//        for(int i=0;i<s2.length();i++)
//        {
//           if(s2.charAt(i)!=' '){
//               ans+=s2.charAt(i);
//            }
//        }
//        System.out.println(ans);

        //method 2 to remove between space
        System.out.println(s2.replace(" ",""));

    }


}
