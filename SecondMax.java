package Algoprep;

public class SecondMax {
    public static int secoMaxElement(int a[])
    {
        int max=-1;
        int smax=-1;

        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                smax=max;
                max=a[i];
            }
            else if(smax<a[i])
            {
                smax=a[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int a[]={12,44,5,8,9};
        int ans=secoMaxElement(a);
        System.out.println(ans);

    }
}
