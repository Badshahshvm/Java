package Algoprep;

public class ProductArray {
    public static int maxProductElement(int a[])
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

        int ans=(smax-1)*(max-1);
        return ans;

    }
    public static void main(String[] args) {
        int a[]={3,4,5,2};
        int ans=maxProductElement(a);
        System.out.println(ans);

    }
}
