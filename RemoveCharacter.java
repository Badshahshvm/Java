package Java.Java;

public class RemoveCharacter {
    public static String removeChar(String s,char c)
    {
        char ch[]=new char[s.length()-1];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                ch[j]=s.charAt(i);
                j++;
            }
        }
        String t=new String(ch);
        return t;

    }

    public static void main(String[] args) {
        System.out.println(removeChar("shiv",'i'));
    }
}
