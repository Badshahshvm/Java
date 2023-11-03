package Algoprep;
//You are given a 0-indexed integer array nums. A pair of indices (i, j) is a bad pair if i < j and j - i != nums[j] - nums[i].

//  Return the total number of bad pairs in nums.

import java.util.Scanner;

public class BadPairs {
    public static long coutBadPairs(int nums[])
    {
        long ans=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(j-i!=nums[j]-nums[i])
                {
                    ans++;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        long ans=coutBadPairs(a);
        System.out.println(ans);

    }
}
