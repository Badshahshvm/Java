package Algoprep;

public class FrequencyQuerry {
    public static int[] countFrequency(int a[], int q[])
    {
        int n=a.length;
        int m=q.length;
        int c[]=new int[m];

        for(int i=0;i<m;i++)
        {
            int val=q[i];
            int count=0;
            for(int j=0;j<n;j++)
            {
                if(val==a[j])
                {
                    count++;
                }

            }
            c[i]=count;
        }
        return c;
    }
    public static void main(String[] args) {
        int a[]={2, 6,3,8,2,3,5,8,10,6};
        int q[]={2,8,3,5};
        int ans[]=countFrequency(a,q);

        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }

    }
}
