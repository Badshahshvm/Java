package Algoprep;

public class prefixSum {
    public static int [] prefixAraray(int a[])
    {
        int pf[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            int sum=0;
            for(int j=0;j<=i;j++)
            {
                sum+=a[j];
            }
            pf[i]=sum;
        }
        return pf;
    }

    public static void main(String[] args) {
        int a[]={4,1,6,-3,7};
        int ans[]=prefixAraray(a);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
