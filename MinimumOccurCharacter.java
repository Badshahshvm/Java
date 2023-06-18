package Java.Java;

public class MinimumOccurCharacter {
    public static char occurMin(String s)
    {
        int a[]=new int[126];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]=a[s.charAt(i)]+1;
        }
        int min=Integer.MAX_VALUE;
        char ch=' ';
        for(int i=0;i<s.length();i++)
        {
            if(min>a[s.charAt(i)])
            {
                min=a[s.charAt(i)];
                ch=s.charAt(i);
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        System.out.println(occurMin("aaaaaabbbc"));
    }
}
