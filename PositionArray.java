package Algoprep;

import java.util.Arrays;

public class PositionArray {

    public static int firstOccurence(int a[], int target)
    {
        Arrays.sort(a);

        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=(s+e)/2;

            if(a[mid]==target)
            {
                ans=mid;
                e=mid-1;
            }
            else if(target>a[mid])
            {
                    s=mid+1;
            }
            else {
                e=mid-1;
            }

        }
        return ans;
    }
    public static int lastOccurence(int a[], int target)
    {
        Arrays.sort(a);
        int s=0;
        int e=a.length-1;
        int ans=-1;
        while(s<=e)
        {
            int mid=(s+e)/2;

            if(a[mid]==target)
            {
                ans=mid;
                s=mid+1;
            }
            else if(target>a[mid])
            {
                s=mid+1;
            }
            else {
                e=mid-1;
            }

        }
        return ans;

    }

    public static int[] findFirstLastPosition(int a[], int target)
    {
        int b[]=new int[2];
         b[0]=firstOccurence(a,target);
         b[1]=lastOccurence(a, target);
         return b;
    }
    public static void main(String[] args) {
        int a[]={1,1,1,2,3,4,5,6,7,};
        int ans[]=findFirstLastPosition(a,1);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
