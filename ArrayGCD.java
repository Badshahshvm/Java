package Algoprep;

import java.util.Scanner;

public class ArrayGCD {


    public static int arrayFindFCD(int a[])
    {
      int ans=Math.abs(a[0]);

        for(int i=1;i<a.length;i++)
        {
            ans=gcdFind(ans,a[i]);
        }
    }
    public static int gcdFind(int a, int b)
    {

        if(a==0)
        {
            return b;
        }

        int temp=gcdFind(b%a,a);
        return temp;
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        int ans=arrayFindFCD(a);
        System.out.println(ans);

    }
}
