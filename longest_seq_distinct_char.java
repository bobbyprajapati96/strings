package string;

import java.util.Arrays;

public class longest_seq_distinct_char {
    static int find(char[] arr){
        int i=0,j=0;
        int ans=0;
        int []index=new int[256];
        Arrays.fill(index,-1);
        while(j<arr.length)
        {
            int lastpos=index[arr[j]];
            boolean isPresent=true;
            if(lastpos == -1 || lastpos <i)
                isPresent=false;
            if(isPresent)
              i=lastpos+1;
            int currWinSize=j-i+1;
            ans=Math.max(ans,currWinSize);
            index[arr[j]]=j;
            j++;
        }
  return ans;
    }
    public static void main(String[] args) {
        String s="abcdapbbc";
        int ans=find(s.toCharArray());
        System.out.println(ans);
    }
}
