package Algoprep;

public class CountElement {
    public static int maximumCount(int[] a) {
        int n=lastNegative(a)+1;
        int p=a.length-firstPositive(a);

        return Math.max(p,n);


    }

    public static  int lastNegative(int a[])
    {
        int s=0;
        int e=a.length-1;
        int ans=0;

        while(s<=e)
        {
            int mid=(s+e)/2;

            if(a[mid]<0)
            {
                ans=mid;
                s=mid+1;
            }

            else
            {
                e=mid-1;
            }

        }
        return ans;
    }

    public static int firstPositive(int a[])
    {
        int s=0;
        int e=a.length-1;
        int ans=0;

        while(s<=e)
        {
            int mid=(s+e)/2;

            if(a[mid]>0)
            {
                ans=mid;
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,-2,-2-3,-4,9,11};
        System.out.println(maximumCount(a));
    }
}
