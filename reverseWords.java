package string;

public class reverseWords {
    public static void main(String[] args) {
        String s1="I am the boss";
        String ans="";
        String [] arr=s1.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            ans+=arr[i]+" ";
        }
        System.out.println(ans);
    }
}
