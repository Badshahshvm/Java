package Java.Java;

public class MaximumOccurCharacter {
    public static char maxOccur(String s)
{
     int a[]=new int [126];
for(int i=0;i<s.length();i++)
{
      a[s.charAt(i)]=a[s.charAt(i)]+1;

}
int max=-1;
char ch=' ';
for(int i=0;i<s.length();i++)
{   if(max<a[s.charAt(i)])
{    max=a[s.charAt(i)];
    ch=s.charAt(i);
}
}
return ch;
}

    public static void main(String[] args) {
          System.out.println(maxOccur("aaab"));
        }
}
