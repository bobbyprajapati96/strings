package persistent;

public class allpermutations
{
    static void generatePer(String s,int start,int end)
    {
        if(start==end-1) System.out.println(s);
        else{
            for(int i=start;i<end;i++){
                s=swap(s,start,i);
                generatePer(s,start+1,end);
                s=swap(s,start,i);
            }
        }
    }

  static String swap(String s, int i, int j) {
        char arr[]=s.toCharArray();
        char ch;
        ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String s="abc";
       int len=s.length();
        System.out.println("all permutations are: ");
        generatePer(s,0,len);
    }
}
