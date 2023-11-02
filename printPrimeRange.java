package Algoprep;

import java.util.Scanner;

public class printPrimeRange {


    public static int countPrime(int n)

    {
        boolean b[]=new boolean[n+1];
        int count=0;
b[0]=b[1]=false;
        for(int i=2;i<n;i++)
        {
            b[i]=true;
        }

        for(int i=2;i*i<n;i++)
        {
            if(b[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                  b[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(b[i])
            {
                count++;
            }
        }
        return count;



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number...");
        int n=sc.nextInt();
        int ans=countPrime(10);
        System.out.println(ans);
    }
}
