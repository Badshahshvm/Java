package Algoprep;

public class MergeTwoArray {

    public static int[] mergeArray(int a[], int b[])
    {
        int n=a.length;
        int m=b.length;

        int c[]=new int[n+m];

        int p1=0;
        int p2=0;
        int p3=0;
        while(p1<n && p2<m)
        {
            if(a[p1]<a[p2])
            {
                c[p3]=a[p1];
                p3++;
                p1++;
            }
            else {
                c[p3]=b[p2];
                p2++;
                p3++;
            }
        }

        while(p1<n)
        {
            c[p3]=a[p1];
            p3++;
            p1++;
        }
        while(p2<m)
        {
            c[p3]=b[p2];
            p3++;
            p2++;
        }
        return c;
    }


    
    public static void main(String[] args) {

        int a[]={3,1,4,9,2};
        int b[]={12,5,22};
        int ans[]=mergeArray(a,b);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }


    }
}
