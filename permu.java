public class permu {
    public static void main(String[] args) {
        String s="abc";
        for(int i=0;i<s.length();i++)
        {
            StringBuffer sb=new StringBuffer();
            for(int j=i;j<s.length();j++)
            {
                System.out.println(sb);
            }
            sb.append(s.charAt(i));
        }
    }
}
