package Java.Java;

public class CountStringWord
{
    public static int countWord(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
              continue;
            }
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int ans=countWord("Muzaffarpur Institutte Of Technology");
        System.out.println(ans);
        int b=countWord("Shivam Kumar");
        System.out.println(b);
    }

}
