package string;

public class longest_common_prefix {
    static String findLongestPrefix(String arr[]){
        String result=arr[0];
        for(int i=arr.length-1;i>0;i--){
            while(!arr[i].startsWith(result)){  // flight starts with flower=false  // flow startWith flowe=false  // flower startswtih flo=false
                result=result.substring(0,result.length()-1); //flowe  , flo ,  fl
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};
        String ans=findLongestPrefix(arr);
        System.out.println(ans);

    }
}
