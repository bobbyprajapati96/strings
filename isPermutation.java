package string;

public class isPermutation {
    static boolean check(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int arr[]=new int[256];
        int i=0;
        char x;
        for(i=0;i<s1.length();i++)
        {
            x=s1.charAt(i);
            arr[x]++;
            x=s2.charAt(i);
            arr[x]--;
        }
        for(int a:arr){
            if(a!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s="abcd";
        String s2="dcba";
        boolean ans=check(s,s2);
        System.out.println(ans);
    }
}
