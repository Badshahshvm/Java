package Java.Java;

public class AddingSpaceString
{
    public static String addSpace(String s, int spaces[])
    {
        char ch[]=new char[s.length()+spaces.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<spaces.length && j<s.length())
        {
            int m=spaces[i];
            while(j<m && j<s.length())
            {
                ch[k]=s.charAt(j);
                j++;
                k++;
            }
            ch[k]=' ';
            k++;
            i++;
        }
        while(j<s.length())
        {
            ch[k]=s.charAt(j);
            j++;
            k++;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s="LeetCodehelpsmelearn";
        int a[]={8,13,15};
        String ans=addSpace(s,a);
        System.out.println(ans);
    }
}
