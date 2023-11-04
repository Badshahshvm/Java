package Algoprep;

public class Merge {
    public static int[] merge(int a[], int s, int m, int e)
    {
        int c[]=new int[e-s+1];
        int p1=s;
        int p2=m+1;
        int p3=0;

        while(p1<=m && p2<=e)
        {
            if(a[p1]<a[p2])
            {
                c[p3]=a[p1];
                p3++;
                p1++;
            }
            else {
                c[p3]=a[p2];
                p2++;
                p3++;
            }
        }

        while(p1<=m)
        {
            c[p3]=a[p1];
            p3++;
            p1++;
        }
        while(p2<=e)
        {
            c[p3]=a[p2];
            p3++;
            p2++;
        }

        for(int i=0;i<c.length;i++)
        {
            a[s+i]=c[i];
        }

        return a;

    }
    public static void main(String[] args) {

        int a[]={1,5,3,7,11,4,17, 8, 29};

        int ans[]=merge(a,2,5,8);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
