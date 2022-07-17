package string;

public class longest_pallindrome {
    static int maxlen=0;
    static int lo=0;
    public static void expandstr(char input[],int j,int k)
    {
//        System.out.println(j+" "+k);
        while(j>=0 && k<input.length && input[j]==input[k])
        {
            j--;
            k++;
        }
        if(maxlen<k-j-1)
        {
            maxlen=k-j-1;
            lo=j+1;
        }
    }
    public static String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            expandstr(ch,i,i);
            expandstr(ch,i,i+1);
        }

        return s.substring(lo,lo+maxlen);
    }
    public static void main(String[] args) {
        String s="abab";
        String ans=longestPalindrome(s);
        System.out.println(ans);
    }
}
