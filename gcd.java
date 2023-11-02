package Algoprep;

import java.util.Scanner;

public class gcd {

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
        System.out.println("enter two numbers ");
        int a=x.nextInt();
        int b=x.nextInt();
        int ans=gcdFind(a,b);
        System.out.println(a);

    }
}
