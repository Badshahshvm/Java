package Java.Java;

public class AllDuplicates {
    public static void printDuplicates(String s)
    {
        int a[]=new int[126];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]=a[s.charAt(i)]+1;

        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>1)
            {
                System.out.println((char)i+" "+ a[i]);
            }
        }
    }

    public static void main(String[] args) {
        printDuplicates("aaaabccd");
    }
}
