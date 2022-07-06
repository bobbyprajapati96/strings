package string;

public class sum_of_numbers_inString {
    public static void main(String[] args) {
         String s ="4PREP2INSTAA6";
//        int sum=0;
//        for(int i=0;i<s.length();i++)
//        {
//            if(Character.isDigit(s.charAt(i)))
//                sum+=Character.getNumericValue(s.charAt(i));
//
//        }
//        System.out.println(sum);

        //method 2
        int sum=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='0' && s.charAt(i)<='9'){
        sum+=(s.charAt(i)-'0');
        }
        }
        System.out.println("Sum of all digits " +sum );
        }

}
