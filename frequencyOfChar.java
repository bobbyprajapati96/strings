package string;

public class frequencyOfChar {
    public static void main(String[] args) {
        String s="tusshar";
        int [] freq=new int[s.length()];
        char[] arr=s.toCharArray();
        int i,j;
        for( i=0;i<s.length();i++)
        {
            freq[i]=1;
            for(j=i+1;j<s.length();j++)
            {
                if(arr[i]==arr[j])
                {   freq[i]++;
                    arr[j]='0';
                }

            }
        }
        System.out.println("Characters and their corresponding frequencies");
        for(i = 0; i <freq.length; i++) {
            if(arr[i] != ' ' && arr[i] != '0')
                System.out.println(arr[i] + "-" + freq[i]);
        }
    }

}
